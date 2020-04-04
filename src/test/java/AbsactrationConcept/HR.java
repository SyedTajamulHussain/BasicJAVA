package AbsactrationConcept;
//Any class with abstrat method will be abstract class
//An abstract class can have abstract method and non abstract method as well	
//we can not create object of abstract classs

public abstract class HR implements NewJoineeInterfaceA {

	
	public void Salary() {

		System.out.println("Salary is $1000");
	}

	public void goodies() {
		System.out.println("Laptop");
		
	}

	public abstract void work();

}
