package day9;

public class ChildClass extends InheritanceBaseClass {

	public static void main(String[] args) {
		
		/*Child class reference and child class object  : This will allow to access  
		all methods of Base class and child class*/
		
		ChildClass obj = new ChildClass();
		obj.div();
		obj.mult();
		obj.sub();
		obj.add();
	
		
		/*Base Class reference and Base Class object  :  this will allow to access
		all methods of only base class*/
		
		InheritanceBaseClass obj1 =new InheritanceBaseClass();
		
		obj1.sub();
		obj1.add();
		
		/*Base Class reference and child class object : this will allow to access 
		all method of only base class*/
		InheritanceBaseClass obj3 = new ChildClass();
		obj3.add();
		obj3.add();
		
/*		Child class refrence and base class object  - this is invalid .. child cannot hold parent.*/
		
		//ChildClass obj4 = new InheritanceBaseClass ();
	}
	
	
	public void div() {
		System.out.println("this is child class method for div");
	}
	
	public void mult() {
		System.out.println("this is child class method for multiplication");
	}

}
