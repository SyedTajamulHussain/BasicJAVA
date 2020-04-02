package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
// it capture data in Key value format
	// it does not follow insertion order.
	// does not entertain duplicate values
	//print value using entryset.
	// it may have one null key and multiple null values 
	public static void main(String[] args) {
	
		HashMap<String, String> hm = new HashMap<String, String>();
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
