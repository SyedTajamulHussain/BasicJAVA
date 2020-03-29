package day5;

public class StringExample1 {

	public static void main(String[] args) {
	
		//String is a class and have many inbuild methods
		// String class inherits from object class which is super class
		
		String Name = "Syed Tajamul Hussain";
		
		
		boolean NameofEmployeec= Name.startsWith("Syed");
		System.out.println("Name start with " + NameofEmployeec);
		
		boolean LastName =Name.endsWith("Hus");
		System.out.println("Last Name start with " + LastName);
	}

}
