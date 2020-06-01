package Arboles;

import ArbolClase.Arbol;
import ArbolClase.Nodo;

public class arbolesIguales {

    public static void main(String[] args) {
        // Este archivo muestra el uso del equals, el codigo se encuentra
        // tanto en la clase Arbol (metodo equals) como en la clase
        // Nodo ( metodo static equal)

        Arbol a1 = new Arbol();
        Arbol a2 = new Arbol();

        a1.ingresarNodo(new Nodo(1));
        a1.ingresarNodo(new Nodo(2));
        a1.ingresarNodo(new Nodo(3));
        a1.ingresarNodo(new Nodo(4));

        a2.ingresarNodo(new Nodo(1));
        a2.ingresarNodo(new Nodo(2));
        a2.ingresarNodo(new Nodo(3));
        a2.ingresarNodo(new Nodo(4));
        System.out.println(a1.equals(a2));


        Arbol b1 = new Arbol();
        Arbol b2 = new Arbol();

        b1.ingresarNodo(new Nodo(1));
        b1.ingresarNodo(new Nodo(2));
        b1.ingresarNodo(new Nodo(3));
        b1.ingresarNodo(new Nodo(5));

        b2.ingresarNodo(new Nodo(1));
        b2.ingresarNodo(new Nodo(2));
        b2.ingresarNodo(new Nodo(3));
        b2.ingresarNodo(new Nodo(4));

        // Deberia imprimir false porque son b1 tiene un nodo mas con valor distinto
        System.out.println(b1.equals(b2));


        Arbol c1 = new Arbol();
        Arbol c2 = new Arbol();

        c1.ingresarNodo(new Nodo(10));

        // Deberia dar false porque c1 tiene datos y c2 no
        System.out.println(c1.equals(c2));

        Arbol d1 = new Arbol();
        Arbol d2 = new Arbol();

        // Deberia dar true porque ambos estan vacios
        System.out.println(d1.equals(d2));

        Arbol e1 = new Arbol();
        Arbol e2 = new Arbol();

        e1.ingresarNodo(new Nodo(1));
        e1.ingresarNodo(new Nodo(2));
        e1.ingresarNodo(new Nodo(3));

        e2.ingresarNodo(new Nodo(1));
        e2.ingresarNodo(new Nodo(2));
        e2.ingresarNodo(new Nodo(3));
        e2.ingresarNodo(new Nodo(4));

        // Deberia imprimir false porque e2 tiene un nodo mas 
        System.out.println(e1.equals(e2));
    }
}
