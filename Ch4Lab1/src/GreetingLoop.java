//Knox, Caden
//October 10, 2023
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
			
			//Get input and assign it to action
			action = n.next();
			
			//Clamp action length
			int length = Math.max(0, Math.min(1, action.length()));
			
			//Set action to clamped length
			action.substring(0, length);
			
		} while(action.equalsIgnoreCase("y") || action.equalsIgnoreCase("yes") || action.equalsIgnoreCase("yup"));
		
		//Print after while loop finishes
		System.out.print("Good-Bye");
	}
}

