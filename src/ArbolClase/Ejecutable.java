package ArbolClase;
import java.util.Scanner;
public class Ejecutable {
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		Arbol arbol=new Arbol();
		
//		arbol.ingresarNodo(new Nodo(10));
//		arbol.ingresarNodo(new Nodo(15));
//		arbol.ingresarNodo(new Nodo(5));
//		arbol.ingresarNodo(new Nodo(1));
//		arbol.ingresarNodo(new Nodo(9));
//		arbol.ingresarNodo(new Nodo(20));
//		arbol.ingresarNodo(new Nodo(14));
//
//		Arbol.inorden(arbol.getRaiz());
//		System.out.println();
//		Arbol.preorden(arbol.getRaiz());
//		System.out.println();
//		Arbol.postorden(arbol.getRaiz());
//		System.out.println();
//		int h = Arbol.altura(arbol.getRaiz());
//		System.out.println(h);
//		int hIt = Arbol.alturaIterativo(arbol.getRaiz());
//		System.out.println(hIt);

		Nodo raiz  = new Nodo(1);
		Nodo derecha = new Nodo(3);
		//Nodo izquierda = new Nodo(2);
		raiz.setDerecho(derecha);
		//raiz.setIzquierdo(izquierda);
		arbol.ingresarNodo(raiz);
		System.out.println(estaLleno(arbol));




	}

	public static boolean estaLleno(Arbol arbol){
		return estaLlenoRecursivo(arbol.getRaiz());
	}

	public static boolean estaLlenoRecursivo(Nodo nodo){

		if(nodo.getIzquierdo() == null && nodo.getDerecho() == null ){
			return true;
		}

		if(nodo.getIzquierdo() == null && nodo.getDerecho() != null ||
				nodo.getIzquierdo() != null && nodo.getDerecho() == null ){
			return false;
		}


		return estaLlenoRecursivo(nodo.getIzquierdo()) && estaLlenoRecursivo(nodo.getDerecho());
	}
}
