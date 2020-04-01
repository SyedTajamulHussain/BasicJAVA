package day4;

public class Class_Object_method {
// global variables
	int x =10;
	int y =20;
	
	public static void main(String[] args) {
		// to call non static method you need to create an object refrence
		Class_Object_method obj = new Class_Object_method();
		obj.Sum();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
	
	public void Sum() { // this is sum method with no return .
		int a = 8;
		int b =9;
		int c = a+b;
		System.out.println("sum of a and be = "+c);
	}

}
