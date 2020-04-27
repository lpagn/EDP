package shuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		double[] aux = {1.0,1.0,2.9,3.4,3.4,3.0,1.5,2.3,2.3,2.3,2.3,4.5};
		
		for(int i = 0 ; i < aux.length ; i++) {
			System.out.print(aux[i] + " ");
		}
		System.out.println();
		for(int i = 0 ; i < aux.length - 2 ; i++) {
			if(aux[i] == aux[i+1]) {
				double temp = aux[i+2];
				aux[i+2] = aux[i+1];
				aux[i+1] = temp;
			}
		}
		
		for(int i = 0 ; i < aux.length ; i++) {
			System.out.print(aux[i] + " ");
		}
		System.out.println();
		int M = 10;
		
		String[] arr = {"A","B","C","D","E","F","G","H","I","J"};
		
		Integer[] intArray = new Integer[M];
        for (int i = 0; i < M; i++) {
            intArray[i] = i;
        }
        
        List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);
		
		String max = "A";
		
		for(int i = 0 ; i < M ; i++) {
			//System.out.println(intList.get(i));
			//System.out.println(arr[intList.get(i)]);
			if(max.compareTo(arr[intList.get(i)])<0) {
				max = arr[intList.get(i)];
			}
		}
		System.out.println(max);
		
	}
}
