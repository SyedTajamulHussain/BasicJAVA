package day6;

public class ReturnValueInMethod {

	public static void main(String[] args) {

		ReturnValueInMethod obj = new ReturnValueInMethod();

		int addtion = obj.sum(10, 20);
		System.out.println(addtion);

		int sub = obj.substraction(20, 10);
		System.out.println(sub);

		String NameOccupation = obj.NameAndoccupation("Tajamul", " QA");
		System.out.println(NameOccupation);
	}

	public int sum(int a, int b) {

		int result = a + b;
		return result;
	}

	public int substraction(int c, int d) {

		int result1 = c - d;
		return result1;
	}

	public String NameAndoccupation(String name, String occupation) {
		String NameAndOccupation = name + occupation;
		return NameAndOccupation;
	}
}
