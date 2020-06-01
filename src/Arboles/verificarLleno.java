package Arboles;

import ArbolClase.Arbol;
import ArbolClase.Nodo;

public class verificarLleno {
    public static void main(String[] args) {

        Arbol arbol = new Arbol();

        System.out.println(estaLleno(arbol));


    }

    public static boolean estaLleno(Arbol arbol){
        return estaLlenoRecursivo(arbol.getRaiz());
    }

    public static boolean estaLlenoRecursivo(Nodo nodo){
        //Caso base
        if(nodo.getDerecho() == null && nodo.getIzquierdo() != null){
            return false;
        }
        if(nodo.getDerecho() != null && nodo.getIzquierdo() == null){
            return false;
        }
        //paso recursivo
        return estaLlenoRecursivo(nodo.getIzquierdo()) && estaLlenoRecursivo(nodo.getDerecho());

    }
}
