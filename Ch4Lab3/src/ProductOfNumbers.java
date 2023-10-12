//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 2

import java.util.Scanner;

public class ProductOfNumbers {

	
	public static void main(String[] args) {
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		double currentNum = 0;
		double product = 1;
		
		//Initial prompt for number
		System.out.print("Enter any number(positive or negative), Q to quit: ");
		
		//Check if input is a double
		while (n.hasNextDouble()) {
			currentNum = n.nextDouble();
			
			//Calculate product
			product *= currentNum;
			
			//Prompt for number
			System.out.print("Enter any number(positive or negative), Q to quit: ");
		}
		//Print result
		System.out.printf("The product of the numbers is: %.2f", product);
	}
}
