package REPASO;

public class Matrix {
	double[][] tablero;
	private int N;
	
	public  Matrix() {
		
	}
	
	public Matrix(int N) {
		this.setN(N);
		this.tablero = new double[N][N];
	}
	
	public void asignarMatriz() {
		for(int i = 0 ; i < getN() ; i++ ) {
			for(int j = 0 ; j < getN() ; j++) {
				tablero[i][j] = i;
			}
		}
	}
	
	public boolean sumaPar() {
		return this.suma()%2==0;
	}
	
	public String sumaParStr() {
		if(this.sumaPar()) {
			return "es par";
		}
		return "no es par";
	}
	
	public double suma() {
		double ret = 0;
		for(int i = 0 ; i < getN() ; i++ ) {
			for(int j = 0 ; j < getN() ; j++) {
				ret += tablero[i][j];
			}
		}
		return ret;
	}
	
	public void visualizarMatriz(char x) {
		for(int i = 0 ; i < getN() ; i++ ) {
			for(int j = 0 ; j < getN() ; j++) {
				System.out.print(tablero[i][j]);
				if(j!=getN()-1) {System.out.print(x);};
			}
			System.out.println();
		}
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}
	
	@Override
	public String toString() {
		return "esta matriz tiene "+N+" elementos";
	}
	
}
