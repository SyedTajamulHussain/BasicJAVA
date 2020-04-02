package setConcept;

import java.util.HashSet;

//Does not maintain insertion order
//trims duplicate values.
//Can not access records based on index

public class Hashsetdemo {

	public static void main(String[] args) {
		
		
		
		HashSet<String> hs =new HashSet<String>();
		hs.add("syed tajamul");
		hs.add("39");
		hs.add("QA Lead");
		hs.add("syed tajamul");
		
		for(String details :hs) {
			System.out.println(details);
			
			
			
		}
		
	}

}
