package day6;

public class A {

	public static void main(String[] args) {

		B obj = new B();

		// non static method
		int multiplication = obj.mulitply(2, 2);
		System.out.println(multiplication);

		int div = obj.division(10, 2);
		System.out.println(div);

		// Calling static method.
		String CN = B.FullName("Syed", "Hussain");
		System.out.println(CN);
	}
}
