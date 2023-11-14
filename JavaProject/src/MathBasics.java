import java.util.Scanner;

public class MathBasics {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = 10;
		
		//find larger of two numbers
		
		double max = Math.max(x, y);
		
		System.out.println("Maximum: " +max);
		
		// find smaller of two numbers
		double min = Math.min(x, y);
		
		System.out.println("Minimum: " + min);
		
		// find absolut value
		
		double neg_value = -10;
		
		double abs = Math.abs(neg_value);
		
		System.out.println("Value: "+ neg_value + " Absolute: " + abs);
		
		// square root
		
		double sqrt = Math.sqrt(y);
		
		System.out.println("Sqrt: " + sqrt);
		
		
		// types of rounding
		
		double value = 3.141592;	
		double round = Math.round(value); //rounds to next long (integer)
		double ceil = Math.ceil(value); // next higher integer
		double floor = Math.floor(value); // next lower integer
				
		System.out.println("Value before: " + value + " Value rounded: " + round + " Value ceiled: " + ceil + " Value floored: " + floor);
		
		
		// find hypothenuse of Triangle
		
		double a;
		double b;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		

		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x) +(y*y));
		System.out.println("Hypothenuse is: " + z);
		
		scanner.close();
		
		
		
				
		
		
	}

}
