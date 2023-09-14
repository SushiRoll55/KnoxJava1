//Knox, Caden
//September 14, 2023
//CS A170
//Chapter 2 Lab 2

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive fahrenheit temp
		System.out.print("Enter a temperature in Fahrenheit: ");
		double farTemp = n.nextDouble();
		
		//Calculate celsius temp and print
		double celTemp = (farTemp - 32) * 5/9;
		System.out.printf("The temperature in Celsius is: %.3f", celTemp);
	}

}
