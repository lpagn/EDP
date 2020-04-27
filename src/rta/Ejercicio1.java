package rta;

public class Ejercicio1 {
	int filas = 3;
	int columnas = 3;
	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
	
	public int sumarFilasImpares() {
		int ret = 0;
		for(int i = 0 ; i < filas ; i ++) {
			for(int j = 0 ; j < columnas ; j++) {
				if(i%2==1) {
					ret += matrix[i][j];
				}
			}
		}
		return ret;
	}
	
	public int sumarColumnasPares() {
		int ret = 0;
		for(int i = 0 ; i < filas ; i ++) {
			for(int j = 0 ; j < columnas ; j++) {
				if(j%2==0) {
					ret += matrix[i][j];
				}
			}
		}
		return ret;
	}
	
	public boolean cumple(int a , int b) {
		return a%2==1 && b%2==0;
	}
	
	public boolean cumple() {
		return sumarFilasImpares()%2==1 && sumarColumnasPares()%2==0;
	}
	
	public String printMatrix(char c) {
		String ret = "";
		for(int i = 0 ; i < filas ; i++) {
			for(int j = 0 ; j < columnas ; j++) {
				ret += matrix[i][j];
				ret += c;
			}
			ret += "\n";
		}
		return ret;
	}
	
}
