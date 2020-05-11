package Listas;

public class Lista {
    Nodo inicio;

    public Lista(){
        this.inicio=null;
    }
    public Lista(Nodo inicio){
        this.inicio=inicio;
    }
    public Nodo getInicio(){
        return this.inicio;
    }
    public void setInicio(Nodo inicio){
        this.inicio=inicio;
    }
    public void ingresarNodo(Nodo uno){
        if (this.inicio==null){
            this.inicio=uno;
        }
        else{
            uno.siguiente=this.inicio;
            this.inicio=uno;
        }
    }
    public boolean BuscarLista(int valor){
        Nodo inicial=inicio;
        boolean esta=false;
        while(inicial!=null && esta == false){
            if(inicial.getdato()!=valor){
                inicial=inicial.getsiguiente();
            }
            else{
                esta=true;
            }

        }
        return esta;
    }
    public void MostrarLista(){
        Nodo inicial=this.inicio;
        while(inicial!=null){
            System.out.println(inicial.getdato());
            inicial=inicial.getsiguiente();
        }
    }


}

