package Basics;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		// ArrayList = a resizable array.(dynamic array)
		// 				Element can be added and removed after compilation
		//				store reference data types
		
		
		// declare with REFERENCE data type NOT primitve
//		ArrayList<String>
//		ArrayList<Integer>
//		ArrayList<Boolean>

		ArrayList<String> food = new ArrayList(); // don't forget brakets
	
		// add item
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		// use .size() instead of .length() with ArrayLists!
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

		System.out.println();
		
		
		// overwrite existing value
		
		food.set(0, "sushi");
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		// delete existing value
		
		food.remove(2);
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println();
		
		// insert between existing values
		
		food.add(1, "MacNcheese");
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		// empty array
		food.clear();
		for(int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		
	}

}
