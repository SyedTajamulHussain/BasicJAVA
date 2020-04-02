package MapConcept;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	// it maintain  insertion order.
	// rest similar with HashMap
	public static void main(String[] args) {
	
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("1", "Tajamul");
		hm.put("6", "Zahra");
		hm.put("2", "Zamin");
		hm.put("3", "Zahid");
		hm.put("4", "Haadiya");
		hm.put("5", "tayyaba");
		
		for(Map.Entry<String ,String> data : hm.entrySet()) {
			System.out.println("Key value is " + data.getKey() +" and value is  " + data.getValue());
		}
	}

}
