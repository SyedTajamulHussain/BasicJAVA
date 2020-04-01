package day4;

public class secoundClass  {

	public static void main(String[] args) {
		
		firstclass obj = new firstclass();
		
		obj.sum(); // calling non static method with obj reference.
		obj.substraction();
		
		System.out.println("Name is " + obj.name);
		System.out.println("Designation is " + obj.designation);

		
		firstclass2.substraction(); // calling static method by class name
		firstclass2.sum();
		
	}

}
