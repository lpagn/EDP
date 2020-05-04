package RandomPackage;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i = 0 ; i < 100000000 ; i ++) {
			double x = 5 + rand.nextDouble()*(15-5);
			if(x < 5 || x > 15) {
				System.out.println(x);
			}
			
		}
	}

}
