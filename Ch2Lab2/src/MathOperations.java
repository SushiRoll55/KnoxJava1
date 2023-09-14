//Knox, Caden
//September 14, 2023
//CS A170
//Chapter 2 Lab 2

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and recieve first int
		System.out.print("Enter the first integer: ");
		int num1 = n.nextInt();
		
		//Prompt for and recieve second int
		System.out.print("Enter the second integer: ");
		int num2 = n.nextInt();
		
		//Calculate each operation and print them
		int sum = num1 + num2;
		Log("" + num1 + " + " + num2 + " = " + sum);
		
		int product = num1 * num2;
		Log("" + num1 + " * " + num2 + " = " + product);
		
		int quotient = num1 / num2;
		Log("" + num1 + " / " + num2 + " = " + quotient);
		
		int modulus = num1 % num2;
		Log("" + num1 + " % " + num2 + " = " + modulus);
	}
	
	//Shorter print line method
	public static void Log(String input) {
		System.out.println(input);
	}

}
