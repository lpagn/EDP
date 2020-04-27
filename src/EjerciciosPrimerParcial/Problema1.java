package EjerciciosPrimerParcial;

public class Problema1 {
	int filas = 3;
	int columnas = 3;
	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
	char separator = '#';
	
	public boolean cumple() {
		/*
		cumple si:
		->la suma de las filas impares es impar
		->la suma de las columnas pares es par
		*/
		
		int sumafilasimpares = 0;
		int sumacolumnaspares = 0;
		
		for(int i = 0 ; i < filas ; i++) {
			for(int j = 0 ; j < columnas ; j++) {
				if(j%2==0) {
					sumacolumnaspares += matrix[i][j];
				}
				if(i%2==1) {
					sumafilasimpares += matrix[i][j];
				}
			}
		}
		
		return sumafilasimpares%2==1 && sumacolumnaspares%2==0;
	}
	
	public String printMatrix() {
		StringBuilder ret = new StringBuilder("");
		for(int i = 0 ; i < filas ; i ++) {
			for(int j = 0 ; j < columnas ; j ++) {
				ret.append(matrix[i][j]);
				ret.append(separator);
			}
			ret.append("\n");
		}
		return ret.toString();
	}
	
	public void setSeparator(char separator) {
		this.separator = separator;
	}
	
}
