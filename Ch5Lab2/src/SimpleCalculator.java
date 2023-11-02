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
		
		//Call functions for addition and multiplacation
		addition(num1, num2);
		multiplication(num1, num2);
	}

	public static void addition(double x, double y) {
		System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
		subtraction(x, y);
	}
	
	public static void subtraction(double x, double y) {
		double result = 0;
		if (x > y) {
			result = x - y;
		}
		else {
			result = y - x;
		}
		System.out.println("The difference of " + x + " and " + y + " is " + result);
	}
	
	public static void multiplication(double x, double y) {
		System.out.println("The product of " + x + " and " + y + " is " + (x * y));
		division(x, y);
	}
	
	public static void division(double x, double y) {
		double result = 0;
		if (x > y && y != 0) {
			result = ((double)x / (double)y);
		}
		else if (x < y && x != 0) {
			result = ((double)y / (double)x);
		}
		else if (x == y) {
			result = 1;
		}
		else {
			System.out.println("Can't divide by zero");
			return;
		}
		System.out.println("The quotient of " + x + " and " + y + " is " + result);
	}
}
