package Listas;

public class EJClase {

    public static void main(String[] args) {

        Lista list = new Lista();

        initializeList(list, 10);

        deletePairs(list);

        System.out.println(list.toString());


    }

    public static void deletePairs(Lista list){

        Nodo current = list.getInicio();
        while(current != null && current.siguiente != null ){
            current.siguiente = current.siguiente.siguiente;
            current = current.siguiente;
        }

    }

    public static void initializeList(Lista list, int nodes){
        for (int i = 0; i <nodes; i++) {
            list.ingresarNodo(new Nodo(i));
        }
    }
}
