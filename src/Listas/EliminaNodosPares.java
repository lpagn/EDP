package Listas;

public class EliminaNodosPares {

    public static void main(String[] args) {
        Lista list = new Lista();
        initializeList(list, 10);

        eliminaPares(list);

    }


    public static void initializeList(Lista list, int nodes){
        for (int i = 0; i <nodes; i++) {
            list.ingresarNodo(new Nodo(i));
        }
    }

    public static void eliminaPares(Lista list){

        Nodo current = list.getInicio();

        while (current != null && current.siguiente != null){

            // saltear nodo
            current.siguiente = current.siguiente.siguiente;

        }
    }

}
