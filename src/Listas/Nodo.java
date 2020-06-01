package Listas;

public class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(){
        this.dato=0;
        this.siguiente=null;
    }
    public Nodo(int dato){
        this.dato=dato;
        this.siguiente=null;
    }
    public Nodo(int dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=null;
    }
    public int getdato(){
        return this.dato;
    }
    public Nodo getsiguiente(){
        return this.siguiente;
    }
    public void setdato(int dato){
        this.dato=dato;
    }
    public void setinicio(Nodo siguiente){
        this.siguiente=siguiente;
    }
}
