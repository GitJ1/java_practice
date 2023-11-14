package Basics;
import java.util.Random;

public class RandomValues {

	public static void main(String[] args) {
		
		// create instance of random class
		// numbers are pseude-random!!
		Random random = new Random();
		
		// RANDOM INT
		// create random integer in range between -2 billion and 2 billion
		int x = random.nextInt();
		System.out.println("Random int: " + x);
		
		// limit range
		int range_limit = 6;
		x = random.nextInt(range_limit); // limit is 0 to range_limit
		System.out.println("Random int: " + x + ". With range limited to : 0 to " + range_limit);
		

		//RANDOM DOUBLE
		// value between 0 and 1
		double y = random.nextDouble();
		System.out.println("Random double: " + y);
		
		
		//RANDOM BOOLEAN
		boolean b = random.nextBoolean();
		System.out.println("Random boolean: " + b);

	}

}
