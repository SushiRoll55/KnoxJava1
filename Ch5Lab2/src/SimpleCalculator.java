//Knox, Caden
//October 19, 2023
//CS A170
//Chapter 5 Lab 2

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//Init scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt for integers
		System.out.println("Please enter two integers: ");
		
		//Get input
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		//Print results
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + addition(num1,num2));
		System.out.println("The difference of " + num1 + " and " + num2 + " is " + subtraction(num1,num2));
		System.out.println("The product of " + num1 + " and " + num2 + " is " + multiplication(num1,num2));
		System.out.println("The quotient of " + num1 + " and " + num2 + " is " + division(num1,num2));
	}

	public static double addition(double x, double y) {
		return x + y;
	}
	
	public static double subtraction(double x, double y) {
		return x - y;
	}
	
	public static double multiplication(double x, double y) {
		return x * y;
	}
	
	public static double division(double x, double y) {
		if (y == 0)
		{
			System.out.println("Cannot divide by zero");
			return 0;
		}
		return (double)x / (double)y;
	}
}
