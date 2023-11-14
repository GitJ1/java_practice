package Basics;

public class ForLoops {

	public static void main(String[] args) {
		// for loop = executes a block of code a specific number of times
		
		// count up
		for(int i = 0; i <= 10; i++ ) {
			System.out.println("I executed "+ (i + 1)  + " times.");
		}
		
		// count up; step 5
		for(int i = 0; i <= 10; i+= 5 ) {
			System.out.println("Stepping in fives: "+ i );
		}
		
		// count down
		for(int i = 10; i >= 0; i-- ) {
			System.out.println("Count down: "+ i  + " times.");
		}
		
		// count down; step 2
		for(int i = 10; i >= 0; i-= 2 ) {
			System.out.println("Stepping down in twos: "+ i);
		}


	}

}
