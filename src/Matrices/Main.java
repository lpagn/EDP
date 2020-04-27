package Matrices;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello, World!");
		
		// Captrurar M cadenas del usuario , unicamente con caracteres numericos
		
		// Maximo N es multiplo de tres y mayor a tres ({6,9,12,...,3*k} con k>=2)
		
		int N = 6;
		int div = 3;
		
		// Captrurar M cadenas del usuario , unicamente con caracteres numericos
		
		Entrada e = new Entrada();
		
		String [] strings = e.readArr(div , 4);
		
		System.out.println("---------------------------");
		
		for(String str : strings) {
			System.out.println(str);
		}
		
		System.out.println("---------------------------");
		
		
		String [] input = {"345123","214001","125851","036704"};
		
		int[][] matrix = new int[input.length][N/div];
		
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
		
		int strcounter = 0;
		for(String str : input) { // veo cada string
			
			//System.out.println(str);
			
			char [] s = str.toCharArray();// paso cada string a un vector de caracteres
			
			int q = 0;// q es la cantidad de caracteres del numero que estoy construyendo -> // Que valores toma ?
			
			int n = 0;// en n voy construyendo el numero (lo tomo int a proposito, si lo tomo string seria mas facil, solo tendria que appendear)
			
			int numcounter = 0;
			
			for(int i = 0 ; i < N ; i++) { // veo cada caracter del string en el cual estoy parado
				int num = s[i] - '0';
				
				//System.out.println(num);
				
				n += num*Math.pow(10,div-q-1);
				q++;
				
				if(q%div==0) {
					
					matrix[strcounter][numcounter] = n;
					
					n = 0; // reiniciar
					q = 0; // reiniciar
					
					numcounter++;//Cumple el ROL de : ? // Que valores toma ? //PUEDO CAMBIARLO DE ORDEN , PASA ALGO ?
					
					//System.out.println("-------------");
				}
			}
			
			strcounter++;//Cumple el ROL de : ?
		}
		
		for(int i = 0 ; i < input.length ; i++) { //recorrer una matriz
			for(int j = 0 ; j < N / div ; j++) {
				System.out.print(matrix[i][j] + "	");
			}
			System.out.println();
		}
		
	}

}
