package MatricesEnClase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada {
	
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
	    
	    int k = input.length() / div; // 123 456 789
	    
	    //System.out.println(k);
	    
	    int q = input.length() % div;// 123 45
	    
	    //System.out.println(q);
	    
	    
	    /*
	    
	    si k >= 2 y q > 1 => es valido
	    
	    
	    
	    */
	    
	    
	    if(k >= 2 && q > 1) /* || !only_nums(input)*/ { // el or es lazy
			return input;
	    }
		System.out.println("Invalid String");
    	return null;
	    
	}
	
}
