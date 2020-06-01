package ArbolClase;

public class Nodo {
	private int valor;
	private Nodo derecho;
	private Nodo izquierdo;
	
	//CONSTRUCTORES
	
	public Nodo(){
		
	}
	public Nodo(int dato){
		this.valor=dato;
		this.derecho=null;
		this.izquierdo=null;
	}
	
	//ANALIZADORAS
	public int getvalor(){
		return valor;
	}
	public Nodo getDerecho(){
		return derecho;
	}
	public Nodo getIzquierdo(){
		return izquierdo;
	}
	
	//MODIFICADORAS
	
	public void setValor(int dato){
		this.valor=dato;
	}
	public void setDerecho(Nodo derecho){
		this.derecho=derecho;
	}
	public void setIzquierdo(Nodo izquierdo){
		this.izquierdo=izquierdo;
	}
	
	//OTROS
	public void agregarNodo(Nodo nuevo){
		if(this.getvalor()>nuevo.getvalor()){
			if(this.getIzquierdo()==null){
				this.setIzquierdo(nuevo);
			}
			else{
				this.getIzquierdo().agregarNodo(nuevo);
			}
		}
		else{
			if(this.getvalor()<nuevo.getvalor()){
				if(this.getDerecho()==null){
					this.setDerecho(nuevo);
				}
				else{
					this.getDerecho().agregarNodo(nuevo);
				}
			}
		}
	}

	public static boolean equal(Nodo n1, Nodo n2) {
		if (n1 == null &&  n2 == null) return true;
		if (n1 == null || n2 == null) return false;

		// A partir de aca ni n1 ni n2 es null
		if (n1.getvalor() != n2.getvalor()) return false;
		return equal(n1.getDerecho(), n2.getDerecho()) && equal(n1.getIzquierdo(), n2.getIzquierdo());
	}
	
}