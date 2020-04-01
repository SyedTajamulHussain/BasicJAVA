package day3;

public class elseif {

	public static void main(String[] args) {

		String browser = "Chrome";
		if (browser.equalsIgnoreCase("Firefox")) {
			System.out.println("test case executed on firefox");
		} else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("test case executed on IE");
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("test case executed on chrome");
		} else {
			System.out.println("Kindly provide valid browser");
		}

	}

}
