package day5;

public class StringExample2 {

	public static void main(String[] args) {

		//splitting the string
		String Name = "Syed-Tajamul-Hussain";
		String splitedName[]=Name.split("-");
		
		for(int i=0; i<splitedName.length; i++) {
			System.out.println(splitedName[i]);
			
			if(splitedName[i].equalsIgnoreCase("hussain")) {
				System.out.println("Test case passed");
				break;
			}
			}
			
		}
		

		
	}


