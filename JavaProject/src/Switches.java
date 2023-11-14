
public class Switches {

	public static void main(String[] args) {
		// switch = statement that allows a variable to be tested for equality against a list of values
		// unless break is set all cases after True case is executed
		String day = "Friday";
		
		switch(day) {
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday!");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thursday": System.out.println("It is Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It is Saturday!");
			break;
			case "Sunday": System.out.println("It is Sunday!");
			default: System.out.println("This is not a day!");

		}

	}

}
