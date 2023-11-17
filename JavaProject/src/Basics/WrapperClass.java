package Basics;

public class WrapperClass {

	public static void main(String[] args) {
//		wrapper class = provides a way to use primitive data types as reference data types
//						reference data types contain useful methods
//						can be used with collections (ex.ArrayList)
						
		// primitive	//Wrapper
		//----------	//--------
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double
						
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive type and the corresponding object wrapper class
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive type
						
		
		// autoboxing = directly assign primitive datatype to reference data type;
		Boolean a = true; 
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Bro";
		
		// usefule methods can be used by typing "." after variable
		
		System.out.println(a.compareTo(false));
		System.out.println(b.charValue());
		System.out.println(b.compareTo('P'));
		System.out.println(c.doubleValue());
		System.out.println(c.equals(123));
		System.out.println(d.intValue());
		System.out.println(d.getClass());
		
		// unboxing allows using reference data type like a primitive type
		// in this case comparing Boolean value to boolean
		if(a == true) {
			System.out.println("this is true");
		}
		
		
		
		
	}

}
