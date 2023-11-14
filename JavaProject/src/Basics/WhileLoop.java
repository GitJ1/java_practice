package Basics;

import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {
		// while loop = executes a block of code as long as a condition remains true
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while(name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.next();
			
		}
		
		System.out.println("Hello, " + name + ". Finally you managed to enter your name.");
		
		
		// Do loop = executes a block of code and repeats if the condtion is still met
		
		String pet = "";
		do {
			System.out.println("Enter your pets name: ");
			pet = scanner.next();
			
			
		}while(name.isBlank());
			
			System.out.println("Hello, " + pet + ". Finally you managed to enter your pets name.");
		
	}

}
