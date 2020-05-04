package recursion;

public class Ej11 {
    public static void main(String[] args){
        System.out.println("a ver ...");
        int[] vec = new int[]{1,2,3,4,5,6,7,8,9};
        int indice = 0;
        int busqueda = 11;
        System.out.println(isPresent(vec,indice,busqueda));
    }

    public static boolean isPresent(int[] vec, int indice, int busqueda){

        // caso base 1 (recorri toda la lista)
        if(vec.length == indice){
            return false;
        }

        // caso base2
        if(vec[indice] == busqueda){
            return true;
        }

        //recursivo
        return isPresent(vec, indice+1, busqueda);

    }





}





/// metod

//caso base

//paso recursivo
