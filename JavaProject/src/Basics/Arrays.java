package Basics;

public class Arrays {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		//creating array with values: has to be the same datatype!
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW", "Mercedes"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println("Car number "+ (i + 1) + ": " + cars[i]);
		}
		System.out.println();
		//creating array without values: has to be the same datatype!
		String[] cars2 = new String[4];
		
		// assing values to empty array
		
		cars2[0] = "Seat";
		cars2[1] = "Fiat";
		cars2[2] = "Citroen";
		cars2[3] = "Peugeot";
		
		for(int i=0; i<cars2.length; i++) {
			System.out.println("Car number "+ (i + 1) + ": " + cars2[i]);
		}
	
	}

}
