package Basics;
import java.util.*;

public class ArrayLists2D {

	public static void main(String[] args) {
		// 2D ArrayList = a dynamic list of lists
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		drinksList.add("cola");
		
		 // declare 2D ArrayList
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList); // print complete 2D list
		
		System.out.println();
		
		System.out.println(groceryList.get(0)); // print inner list

		System.out.println();
		
		System.out.println(groceryList.get(0).get(0)); // print element of inner list
		
		

	}

}
