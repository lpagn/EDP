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
		
		public static int alturaIterativo(Nodo root) {
			if(root==null) {
				return 0;
			}
			Queue<Nodo> queue = new LinkedList<>();
			queue.add(root);
			int h = 0;
			while(!queue.isEmpty()) {
				int nodeCount = queue.size();
				if(nodeCount==0) {
					return h;
				}
				h++;
				while(nodeCount>0) {
					Nodo n = queue.poll();
					if(n.getIzquierdo()!=null) {
						queue.add(n);
					}
					if(n.getDerecho()!=null) {
						queue.add(n);
					}
					nodeCount--;
				}
			}
			return h;
		}
		
	}