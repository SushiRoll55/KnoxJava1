//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 2

import java.util.Scanner;

public class MaximumOfNumbers {
	
	public static void main(String[] args) {
		//Constants
		final int SENTINEL = -1;
		
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		int currentNum = 0;
		int max = 0;
		boolean isDone = false;
		
		while (!isDone) {
			//Prompt for number
			System.out.print("Enter a positive number, -1 to finish: ");
			currentNum = n.nextInt();
			
			//Check if sentinel was entered
			if (currentNum != SENTINEL) {
				//Set max to current num if its bigger than max
				if (currentNum > max) {
					max = currentNum;
				}
			}
			else {
				//Sentinel was entered
				isDone = true;
			}
		}
		//Print result
		System.out.print("The maximum number is: " + max);
	}
}
