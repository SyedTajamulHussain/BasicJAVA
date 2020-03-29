package day7;

public class MedhodOverloading_Polymorphism {
	//

	public static void main(String[] args) {

		MedhodOverloading_Polymorphism obj = new MedhodOverloading_Polymorphism();
//Method overloading means same method with different arguments/parametes/signature
		//method overloading is also called early binding/compile time
		obj.sum();
		obj.sum(10, 1);
		obj.sum(10, 10, 10);
		obj.sum(10.10, 10.10);
		obj.sum(10.5, 1);
		obj.sum(10, 20.50);

	}

	public void sum() {
		String name = "tajamul";
		System.out.println(name);
	}
	// same method name different parameters/signature
	public void sum(int a, int b) {

		int result = a + b;
		System.out.println(result);
	}
//Same method name different number of parameters
	public void sum(int a, int b, int c) {
		int result = a + b + c;
		System.out.println(result);

	}

//Same method name different number of parameters
	public void sum(double a, double b) {
		double result = a + b;
		System.out.println(result);

	}
// different type of of signature i.e double and int to achieve method over loading 
	public void sum(double a, int b) {
		double result = a + b;
		System.out.println(result);

	}
//different order of signature to achieve method over loading 
	public void sum(int a, double b) {
		double result = a + b;
		System.out.println(result);

	}
}
