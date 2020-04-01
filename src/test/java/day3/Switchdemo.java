package day3;

public class Switchdemo {

	public static void main(String[] args) {
		switchexample();
		
		
		int x = 4;
		
		switch (x) {
		case 1:
			System.out.println("FAIL");
			break;
		case 2:
			System.out.println("3rd division");
			break;
		case 3:
			System.out.println("2rd division");
			break;
		case 4:
			System.out.println("ist division");
			break;
		default:
			System.out.println("No appreared in exam");
		}

	}
	
	public static void switchexample() {
		String husband = "Tajamul";
		
		switch (husband) {
		
		case "husbandd":
			System.out.println("husbandd");
			break;
			
		case "wife":
			System.out.println("wife");
			break;
		case "Tajamul":
			System.out.println("husband");
			break;
			
		default:
				System.out.println("No match");
		}
		
		
	}

}
