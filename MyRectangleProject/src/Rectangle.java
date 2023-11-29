//Knox, Caden
//November 2023
//CS A170
//Chapter 8 Lab 2

public class Rectangle {
	//Instance variables
	private int length;
	private int width;
	
	//Constructors
	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	//Instance methods
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		return this.length*this.width;
	}
	
	public int getPerimeter() {
		return (2*this.length) + (2*this.width);
	}
	
	public void printDimentions() {
		System.out.println("The length is: " + this.length);
		System.out.println("The width is: " + this.width);
	}
}