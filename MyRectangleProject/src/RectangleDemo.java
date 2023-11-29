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
		box1.printDimentions();
		System.out.println("Area1 is: " + box1.getLength() * box1.getWidth() + " sq. ft.");
		System.out.println("Area2 is: " + box1.getArea() + " sq. ft.");
		System.out.println("The perimeter is: " + box1.getPerimeter() + " ft.");
		
		//now do test cases 2 and 3
	}
}