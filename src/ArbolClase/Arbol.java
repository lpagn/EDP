package ArbolClase;

import java.util.LinkedList;
import java.util.Queue;

public class Arbol {
	Nodo raiz;
	
	//CONSTRUCTORES
	
	public Arbol(){
}
	//ANALIZADORAS
	public Nodo getRaiz(){
		return raiz;
	}
	//MODIFICADORAS
	public void setRaiz(Nodo raiz){
		this.raiz=raiz;
	}
	//OTRAS
		public boolean esVacio(){
			if (raiz==null)
				return true;
			else
				return false;
					
		}
		public void ingresarNodo(Nodo nuevo){
			if( this.esVacio()){
				this.raiz=nuevo;
			}
			else{
				this.raiz.agregarNodo(nuevo);
		}
				
		}
		public static void preorden(Nodo nuevo){
			if (nuevo!=null){
				System.out.print(nuevo.getvalor() + " ");
				preorden(nuevo.getIzquierdo());
				preorden(nuevo.getDerecho());
			}
		}
		public static void postorden(Nodo nuevo){
			if(nuevo!=null){
				postorden(nuevo.getIzquierdo());
				postorden(nuevo.getDerecho());
				System.out.print(nuevo.getvalor()+ " ");	
			}
		}
		public static void inorden(Nodo nuevo){
			if(nuevo!=null){
				inorden(nuevo.getIzquierdo());
				System.out.print(nuevo.getvalor()+ " ");
				inorden(nuevo.getDerecho());
			}
		}
		public static int altura(Nodo current){
			if(current==null) {
				return 0;
			}
			return 1 + Math.max(altura(current.getDerecho()),altura(current.getIzquierdo()));
		}
		
		public static int alturaIterativo(Nodo node) {
			// Caso base, la altura de un arbol vacio es 0 
	        if (node == null) 
	            return 0; 
	   
	        // Crear una cola vacia 
	        Queue<Nodo> q = new LinkedList(); 
	   
	        // Encolar el nodo raiz, el cual ya sabemos que no es nulo 
	        q.add(node); 
	        int height = 0; 
	   
	        while (1 == 1)  
	        { 
	        	// Veamos cuantos nodos hay en este nivel
	            int nodeCount = q.size(); 
	            if (nodeCount == 0) 
	                return height; // si no hay nodos en el siguiente nivel, es porque se termino el arbol
	            height++; // si el arbol no se termino, incrementar la altura
	   
	            // Desencolar todos los nodos de este nivel, y encolar todos los nodos del siguiente nivel
	            while (nodeCount > 0)  
	            { 
	                Nodo newnode = q.peek(); 
	                q.remove(); 
	                if (newnode.getIzquierdo() != null) 
	                    q.add(newnode.getIzquierdo()); 
	                if (newnode.getDerecho() != null) 
	                    q.add(newnode.getDerecho()); 
	                nodeCount--; 
	            } 
	        } 
		}

	public boolean equals(Arbol a2) {
		return Nodo.equal(this.raiz, a2.getRaiz());
	}
		
	}