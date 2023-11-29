//Knox, Caden
//November 2023
//CS A170
//Chapter 8 Lab 2

/**
 * This is a demo class that creates two cars and uses methods from the Car class
 * @author cknox17
 */
public class CarDemo {

	public static void main(String[] args) {
		//Part A
		Car adamCar = new Car();
		Car sarahCar = new Car("Toyota", "Tacoma", 2022, 20, "blue", 40000);
		
		//Part B
		adamCar.setMake("Ford");
		adamCar.setModel("Mustang");
		adamCar.setYear(2018);
		adamCar.setSpeed(80);
		adamCar.setColor("red");
		adamCar.setPrice(80000);
		
		//Part C
		System.out.println("Adam car color: " + adamCar.getColor());
		System.out.println("Sarah car color : " + sarahCar.getColor());
		
		//Part D
		System.out.println();
		adamCar.displayFeatures();
		System.out.println();
		sarahCar.displayFeatures();
		System.out.println();
		
		//Part E
		adamCar.accel();
		System.out.println(adamCar.getSpeed());
		adamCar.accel(100);
		System.out.println(adamCar.getSpeed());
		adamCar.brake(20);
		System.out.println(adamCar.getSpeed());
	}
}
