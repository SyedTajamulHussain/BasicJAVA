package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListGenrics {

	public static void main(String[] args) {
		
	List<String> ar = new ArrayList<String>();
	ar.add("Syed Tajamul Hussain");
	ar.add("Male");
	ar.add("age is 38");
	ar.add("Heigh is six feet");
	
	
	System.out.println(ar);	
	
	System.out.println(ar.get(0));
	
	//Normal for loop
	int details=ar.size();
	
	for(int i=0; i<details; i++) {
		System.out.println("My details are " +ar.get(i));
		
	}
	//advance for loop
	
	for (Object abc:ar) {
		System.out.println(abc);
	}
	
	// for with iterator
	
	Iterator itr =ar.iterator();
	while (itr.hasNext()) {
		 Object result =itr.next();
		 System.out.println("details " + result);
	}
	

	}

}
