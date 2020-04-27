package MatricesEnClase;

import java.io.IOException;

import Matrices.Entrada;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Hola, mundo!");
		
		// Captrurar M cadenas del usuario , unicamente con caracteres numericos
		
		// Maximo N es multiplo de tres y mayor a tres ({6,9,12,...,3*k} con k>=2)
		
		// Porque nos dan esta restriccion ?
		
		int N = 6;
		int div = 3;
		
		
		
		
		Entrada e = new Entrada();
		
		String [] strings = e.readArr(div , 4);
		
		
		String [] input = {"345123","214001","125851","036704"};
		
		double[][] matrix = new double[input.length][N/div];
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 2 ; j++ ) {
				System.out.print(matrix[i][j] + "	");
			}
			System.out.println();
		}
		
		int I = 0;
		
		for(String str : input) { //veo cada string
			char [] c = str.toCharArray();
			
			System.out.println(str);
			
			int q = 0;
			double n = 0;
			
			int J = 0;
			
			for(int i = 0 ; i < N ; i++) {
				char x = c[i];
				System.out.println(x);
				int aux = x - '0';
				//una funcion que pasa de char a int
				
				n = n + aux*Math.pow(10,div-q-1);
				
				q++;
				//0 1 2 3 4 5
				if(q%div==0) {
					System.out.println("-------");
					
					System.out.println(n);
					
					matrix[I][J] = n;
					J++;
					
					q = 0;
					n = 0;
				}
				
				
			}
			System.out.println();
			I++;
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 2 ; j++ ) {
				System.out.print(matrix[i][j] + "	");
			}
			System.out.println();
		}
		
		/*
		
		"345123"
		"214001"
		"125851"
		"036704"
		
		345	123
		214	1
		125	451
		36	704
		
		*/
		
	}

}
