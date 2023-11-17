package Basics;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Jens";
		
		// case sensitive comparison
		boolean result =  name.equals("jens");
		System.out.println(result);
		result =  name.equals("Jens");
		System.out.println(result);
		
		// case INsensitive comparison
		result =  name.equalsIgnoreCase("jens");
		System.out.println(result);
		
		// length of a String
		int str_len = name.length();
		System.out.println("Length of name"+ str_len);
		
		// access character via index
		char my_char = name.charAt(3);
		System.out.println("Char at 3 in name is: " + my_char);
		
		// get index of FIRST appearance of character
		int index_of_char = name.indexOf("J");
		System.out.println("\"J\" is at index: "+ index_of_char);
		
		// check if String is empty
		boolean is_empty = name.isEmpty();
		System.out.println("Is empty?:"+ is_empty);
		
		// upper case everythin
		name = name.toUpperCase();
		System.out.println("All upper: " + name);
		name = name.toLowerCase();
		System.out.println("All lower: " + name);
		
		// delete empty space before and after characters
		
		String half_empty_string = "   Hal  lo   ";
		System.out.println("Before trim \"" + half_empty_string + "\"");
		half_empty_string = half_empty_string.trim();
		System.out.println("After trim \"" + half_empty_string + "\"");
		
		// replace parts of string
		String to_be_replaced = "Bananarama";
		System.out.println("Before replacing: " + to_be_replaced);
		
		to_be_replaced = to_be_replaced.replace('a', 'o');
		System.out.println("After replacing: " + to_be_replaced);
		
		// split
		String my_string = "Hi_my_name_is_slim_shady";
		String[] my_split = my_string.split("_");
		System.out.println("Before splitting with \"_\": " + my_string);
		for(int i = 0; i<my_split.length; i++) {
			System.out.println(my_split[i]);
		}
		
		// concatenate
		String str1 = "hello";
		String str2 = " Marc";
		String str_concat = str1.concat(str2);
		
		System.out.println(str_concat);
		
		
				
		
		
		
	}

}
