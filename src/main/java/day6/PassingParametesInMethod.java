package day6;

public class PassingParametesInMethod {
	
	
	public static void main(String[] args) {
		
		PassingParametesInMethod obj  = new PassingParametesInMethod();
		
		obj.sum(10, 20);
		obj.substraction(20, 10);
		obj.NameAndoccupation("Tajamul", " QA");
		
		
	}

	public void sum(int a, int b) {

		int result = a + b;
		System.out.println(result);

	}

	public void substraction(int c, int d) {

		int result = c - d;
		System.out.println(result);

	}
	
	public void NameAndoccupation(String name, String occupation ) {
		String NameAndOccupation = name + occupation;
		System.out.println(NameAndOccupation);
	}

}
