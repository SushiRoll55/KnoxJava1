//Knox, Caden
//September 19, 2023
//CS A170
//Chapter 3 Lab 1

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive a number
		System.out.print("Input a number: ");
		int num = n.nextInt();
		
		//Check if even or odd and print accordingly
		System.out.print("Th number " + num + " is ");
		if (num % 2 == 0)
		{
			System.out.print("even");
		}
		else 
		{
			System.out.print("odd");
		}
	}

}
