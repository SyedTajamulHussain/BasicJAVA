package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    //array list maintain insertion order
	//accepts duplicate values.
	// can access records based on index
	
	public static void main(String[] args) {
		
	ArrayList ar = new ArrayList();
	ar.add("Syed Tajamul Hussain");
	ar.add('M');
	ar.add(37);
	ar.add(6.7);
	ar.add("Syed Tajamul Hussain");
	System.out.println(ar);	
	
	System.out.println("based on index " +""+ ar.get(0));
	
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
