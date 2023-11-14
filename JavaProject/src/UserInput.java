import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("What is your name? ");
			String name = scanner.nextLine();
			System.out.println("How old are you? ");
			int age = scanner.nextInt();
			System.out.println("What is your pets name? ");
			//simply using nextLine() after nextInt() is not going to work
			//nextLine will grab the next \n which was not grabbed by nextInt and skip next User Input
			//Therefore you must use an empty scanner.nextLine() to "clear" the scanner
			scanner.nextLine();
			
			String petName = scanner.nextLine();
			
			
			System.out.println("\n\nYour name: " + name + "\nage: " + age + "\npet name: " + petName);
		}

	}

}
