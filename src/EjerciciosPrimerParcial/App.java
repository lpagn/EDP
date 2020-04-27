package EjerciciosPrimerParcial;

public class App {

	public static void main(String[] args) {
		Problema1 p1 = new Problema1();
		p1.setSeparator('x');
		System.out.println(p1.printMatrix());
		System.out.println(p1.cumple());
	}

}
