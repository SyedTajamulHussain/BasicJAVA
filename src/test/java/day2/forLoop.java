package day2;

public class forLoop {

	public static void main(String[] args) {
	//Loop is general concepts in any programming language which will allow you to run certain piece of code multiple times

		Print1TO20ForLoop();
		printevennumbers();	
		PrintoddNumbers();
		
	}

	public static void Print1TO20ForLoop() {
	
			for(int i=1 ;i<=20;i++) {
			
			System.out.println("I value is " + i);
		}
		
	}
	
	public static void printevennumbers() {
		for(int i=2; i<=20; i=i+2) {
			System.out.println("This is Even number" + i);
		}
		
	}
	
	public static void PrintoddNumbers() {
		for(int i=1; i<=20; i= i+2) {
			System.out.println("this is odd number" + i);
		}
	}
	
}
