package Basics;
import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		for(String i : animals) {
			System.out.println(i);
		}

		ArrayList<String> animalList = new ArrayList();
		
		animalList.add("monkey");
		animalList.add("lion");
		animalList.add("bear");
		animalList.add("giraffe");
		animalList.add("hipp");
		
		for(String i : animalList) {
			System.out.println(i);
		}
		
		
		
		

	}

}
