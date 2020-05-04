package recursion;

public class FuncionesRecursivas {
	
	public int ejercicio15(int []v , int i , int pos) {
		if(i == pos - 1) {
			return v[i];
		}
		return v[i] + ejercicio15(v,i+1,pos);
	}
	
	
	
	
	
	
	public int ejerciciorecursion(int[] v,int pos){
		int j = v.length;
		//System.out.println("Longitud: " + j);
		if (pos == (j-1)) {
			System.out.println("Estoy en el caso base: " + v[pos]);
			return v[pos];
		}
		else {
			System.out.println("v[" + pos + "] = " + v[pos]);
			return v[pos] + ejerciciorecursion(v, pos+1); 
		}
	}
	
	
	
	
	
	
	
	
	public int ejercicio15Enserio(int[][] matrix , int i) {
		if(i == (matrix.length-1)) {
			return ejerciciorecursion(matrix[i],0);
		}
		return ejerciciorecursion(matrix[i],0) + ejercicio15Enserio(matrix,i+1) ;
	}
	
}
