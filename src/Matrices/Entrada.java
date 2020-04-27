package Matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
	
	private boolean only_nums(String str) {
		char [] arr = str.toCharArray();
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			int num = arr[i] - '0';
			//System.out.println(arr[i]);
			//System.out.println(num);
			if(num < 0 || num > 9) {
				//System.out.println("F");
				return false;
			}
		}
		return true;
	}
	
	public String [] readArr(int div , int n) throws IOException {
		String [] ret = new String[n];
		for(int i = 0 ; i < n ; i++) {
			ret[i] = read(div);
		}
		return ret;
	}
	
	public String read(int div) throws IOException { 
		//Enter data using BufferReader
	    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	    // Reading data using readLine 
	    System.out.print("$:>");
	    String input = reader.readLine(); 
	    // Printing the read line 
	    System.out.println(input);
	    
	    int k = input.length() / div;
	    
	    //System.out.println(k);
	    
	    int q = input.length() % div;
	    
	    //System.out.println(q);
	    
	    if(( k<2 || q != 0 ) || !only_nums(input) ) { // el or es lazy
	    	System.out.println("Invalid String");
	    	return null;
	    }
		return input;
	    
	}
}
