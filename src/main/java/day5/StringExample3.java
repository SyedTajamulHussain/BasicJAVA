package day5;

public class StringExample3 {

	public static void main(String[] args) {
	
		//comparing two strings
		//String is a class and have many inbuild methods
		// String class inherits from object class which is super class
		
		String actual = "Syed Tajamul Hussain";
		String expected = "1Syed Tajamul Hussain";
		
		boolean compare =actual.equalsIgnoreCase(expected);
		System.out.println("String is matching " + compare);
		
	}

}
