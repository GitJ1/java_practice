package Basics;
import java.util.Scanner;

public class ConditionBasics {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt(); 
				
		if(age >= 18) {
			
			System.out.println("You are an adult!");
			
		}
		else if(age >= 16) {
			System.out.println("You are an schmadult");
		}
		
		else {
			System.out.println("Go home now!");
		}
		
		// WARNING! String-equality must use .equals() function
		System.out.println("Enter your name: ");
		String name = scanner.next();
		if(name.equals("Jens")) {
			System.out.println("You are the best!");
		}
		else if(name.equals("Rüdiger")){
			System.out.println("You are a mess!");
		}
		else {
			System.out.println("You are okay!");
		}
		
		scanner.close();
		
		

	}

}
