package InterfaceConcept;

public class interfaceDemo implements Interface {

	public static void main(String[] args) {
		
		//Child class reference and child class object : this will alow all methods of interface and class
		
		interfaceDemo obj = new interfaceDemo();	
	
		obj.add();
		obj.Substraction();
		obj.multiplicaton();
		
		//Base Class reference and Base Class object : this will allow only access methods of base class only.
		
		Interface obj1 = new interfaceDemo();
		obj1.add();
		obj1.Substraction();
		//obj1.multiplicaton();
	}

	@Override
	public void add() {
	
		System.out.println("i am overridden method addition");
		
	}

	@Override
	public void Substraction() {
		System.out.println("i am overridden method Substraction");
		
	}
	public void multiplicaton() {
		System.out.println("i am  multiplicaton");
}
}
