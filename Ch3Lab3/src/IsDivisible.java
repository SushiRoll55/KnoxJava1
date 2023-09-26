//Knox, Caden
//September 26, 2023
//CS A170
//Chapter 3 Lab 3

import java.util.Scanner;

public class IsDivisible {

	public static void main(String[] args) {
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for ints
		System.out.print("Enter two integers, I’ll check if one is divisible by the other: ");
		if (n.hasNextInt()) {
			int firstInt = n.nextInt();
			if (n.hasNextInt()) {
				int secondInt = n.nextInt();
				
				if (firstInt % secondInt == 0) {
					System.out.print(firstInt + " is divisible by " + secondInt);
				}
				else if (secondInt % firstInt == 0) {
					System.out.print(secondInt + " is divisible by " + firstInt);
				}
				else {
					System.out.print(firstInt + " and " + secondInt + " are not divisible");
				}
			}
			else {
				System.out.print("Input is not an integer");
			}
		}
		else {
			System.out.print("Input is not an integer");
		}
	}
}
