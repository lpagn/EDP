package Listas;

public class EJClase {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.agregarNodoAlFinal(10);

        System.out.println(10);
        lista.agregarNodoAlFinal(9);
        System.out.println(10);
    }

    public static void deletePairs(Lista list){

        Nodo current = list.getInicio();
        while(current != null && current.siguiente != null ){
            current.setinicio(current.getsiguiente().getsiguiente());
            current = current.siguiente;
        }

    }

    public static void initializeList(Lista list, int nodes){
        for (int i = 0; i <nodes; i++) {
            list.ingresarNodo(new Nodo(i));
        }
    }
}
