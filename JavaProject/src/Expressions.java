
public class Expressions {

	public static void main(String[] args) {
		// expressions = combination of operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %
		
		int friends = 10; 
		
		friends = friends + 1;
		
		System.out.println(friends);
		
		friends = friends - 2;

		System.out.println(friends);
		
		friends = friends * 2;
				
		System.out.println(friends);
	
		friends = friends / 2;
		
		System.out.println(friends);
		
		friends = friends % 2;
		
		System.out.println(friends);
		
		
		
		friends++;	
		
		System.out.println(friends);
		
		friends--;	
		
		System.out.println(friends);
		
		
		// INTEGER DIVISION
		
		friends = 10 ;
		friends = friends / 3; // cuts of decimal portion
		
		System.out.println(friends);
		
		// convert variable to new datatype
		friends = 10; // is int
		double double_friends;
//		friends = (double) friends / 3; THIS DOES NOT WORK. Result of Division is now double but still tries to assign double to int!
		
		double_friends = (double) friends / 3;
		friends = friends / 3;
		System.out.println("Integer Division: " + friends + " Double Divsion: " + double_friends);
		
		
		
		
	
	}

}
