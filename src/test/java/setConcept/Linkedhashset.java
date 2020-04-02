package setConcept;


import java.util.LinkedHashSet;

//Same as hashset but maintain order.
//trims duplicate values.
//Can not access records based on index

public class Linkedhashset {

	public static void main(String[] args) {
		
		
		
		LinkedHashSet<String> hs =new LinkedHashSet<String>();
		hs.add("syed tajamul");
		hs.add("39");
		hs.add("QA Lead");
		hs.add("syed tajamul");
		
		for(String details :hs) {
			System.out.println(details);
			
			
			
		}
		
	}

}
