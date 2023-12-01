//Knox, Caden
//November 2023
//CS A170
//Chapter 8 Lab 2

public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(10, 20);
		Rectangle box2 = new Rectangle(4, 5);
		Rectangle box3 = new Rectangle(50, 40);
		
		System.out.println("Test case 1: ");
		runTestCase(box1);
		
		System.out.println("\nTest case 2: ");
		runTestCase(box2);
		
		System.out.println("\nTest case 3: ");
		runTestCase(box3);
	}
	
	static void runTestCase(Rectangle box) {
		box.printDimentions();
		System.out.println("Area1 is: " + box.getLength() * box.getWidth() + " sq. ft.");
		System.out.println("Area2 is: " + box.getArea() + " sq. ft.");
		System.out.println("The perimeter is: " + box.getPerimeter() + " ft.");
	}
}