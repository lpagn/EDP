package REPASO;

public class Main {
	public static void main(String[] args) {
		Matrix m = new Matrix();
		m.asignarMatriz();
		m.visualizarMatriz('-');
		System.out.println(m.suma());
		System.out.println(m.sumaPar());
		System.out.println(m.sumaParStr());
		System.out.println(m);
		System.out.println("El objeto m tiene " + m.getN() + " elementos");
	}
}
