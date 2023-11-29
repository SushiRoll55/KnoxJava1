//Knox, Caden
//November 2023
//CS A170
//Chapter 8 Lab 2

/**
 * This is a class that will represent the attributes and behaviors of cars
 * @author cknox17
 */
public class Car {
	//Instance variables
	private String make;
	private String model;
	private int year;
	private int speed;
	private String color;
	private double price;
	
	//Constructors
	public Car() {
		
	}
	
	public Car(String make, String model, int year, int speed, String color, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.color = color;
		this.price = price;
	}
	
	//Instance methods
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accel() {
		this.speed += 10;
	}
	
	public void accel(int amount) {
		if (amount > 100) {
			System.out.println("Caution!! You may get a ticket!");
		} else {
			this.speed += amount;
		}
	}
	
	public void brake() {
		this.speed -= 10;
	}
	
	public void brake(int amount) {
		int newSpeed = this.speed - amount;
		if (newSpeed >= 0) {
			this.speed = newSpeed;
		} else {
			System.out.println("Speed cannot be negative");
		}
	}
	
	public void displayFeatures() {
		System.out.println("Make: "+ this.make);
		System.out.println("Model: "+ this.model);
		System.out.println("Year: "+ this.year);
		System.out.println("Speed: " + this.speed);
		System.out.println("Color: " + this.color);
		System.out.println("Price: " + this.price);
	}
}
