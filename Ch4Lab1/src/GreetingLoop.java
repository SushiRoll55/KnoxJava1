//Knox, Caden
//October 5, 2023
//CS A170
//Chapter 4 Lab 1

import java.util.Scanner;

public class GreetingLoop {

	public static void main(String[] args) {
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		//Declare action string
		String action = "";
		
		do
		{
			//Prompt user with action
			System.out.print("Hello\nDo you want another greeting?\nPress y for yes, n for no,\nand then press return: ");
			
			//Set action string to first three characters of input
			action = n.next().substring(0, Math.min(Math.max(action.length(), 1), 3));
			
		} while(action.equalsIgnoreCase("y") || action.equalsIgnoreCase("yes") || action.equalsIgnoreCase("yup")); //Loop while input is yes or yup
		
		//Print after while loop finishes
		System.out.print("Good-Bye");
	}
}
