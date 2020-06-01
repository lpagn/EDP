package recursion;


public class Posfijo {
    public static void main(String[] args) {
        calculoPostFijo("1 2 + 10 10 + 1 6 + + +");
    }
    public static void calculoPostFijo(String cuenta){
        String[] params = cuenta.split(" ");
        System.out.println(calculoPostFijoRecursivo(params, 0));
    }

    public static String calculoPostFijoRecursivo(String[] params, int indice){

        if(indice == params.length){
            return "0";
        }

        if(isDigit(params[indice])){
            String num = "" + params[indice];
            String other = calculoPostFijoRecursivo(params, ++indice);
            int result = (Integer.parseInt(num) + Integer.parseInt(other));
            return "" + (result + Integer.parseInt(calculoPostFijoRecursivo(params,++indice)));
        }else{
            return "0";
        }
    }

    public static boolean isDigit(String n){

        if( n.contains("0") ||
                n.contains("2")  ||
                n.contains("1")  ||
                n.contains("3")  ||
                n.contains("4")  ||
                n.contains("5")  ||
                n.contains("6")  ||
                n.contains("7")  ||
                n.contains("8")  ||
                n.contains("9") ){
            return true;
        }

        return false;
    }

    public static boolean isOpen(String n){
        if( n.compareTo("(") == 0){
            return true;
        }
        return false;
    }

    public static boolean isClose(String n){
        if( n.compareTo(")") == 0){
            return true;
        }
        return false;
    }

}
