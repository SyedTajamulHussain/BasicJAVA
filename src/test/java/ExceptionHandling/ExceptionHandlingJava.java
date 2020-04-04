package ExceptionHandling;

public class ExceptionHandlingJava {

	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
		int a =100/0;
		System.out.println(a);
		} catch (ArithmeticException e){
			System.out.println("error is " + e.getMessage());
			
		}
		
	
		System.out.println("Program end");

	}

}
