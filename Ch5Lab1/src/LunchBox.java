//Knox, Caden
//October 19, 2023
//CS A170
//Chapter 5 Lab 1

public class LunchBox {

	public static void main(String[] args) {
		fruit();
		
		System.out.print("I hope you enjoyed your lunch, I wonder what's for dinner?");
	}
	
	static void fruit() {
		System.out.println("I'm so sweet");
		veggie();
	}
	
	static void veggie() {
		System.out.println("I'm so crunchy");
		chips();
	}

	static void chips() {
		System.out.println("I'm so savory");
	}
}
