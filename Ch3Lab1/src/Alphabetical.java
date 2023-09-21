//Knox, Caden
//September 21, 2023
//CS A170
//Chapter 3 Lab 1

import java.util.Scanner;

public class Alphabetical {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for first word
		System.out.println("Enter your first word using all lowercase:");
		String firstWord = n.next();
		
		//Prompt for second word
		System.out.println("Enter your second word using all lowercase:");
		String secondWord = n.next();
		
		//Get ascii values of each character
		int ascii1 = firstWord.charAt(0);
		int ascii2 = secondWord.charAt(0);
		
		//Initialize result
		String result = "";
		
		//Check which word comes first in alphabet
		if (ascii1 < ascii2) {
			result = "before ";
		}
		else if (ascii1 > ascii2)
		{
			result = "after ";
		}
		else
		{
			//Runs if they are the same
			System.out.print(firstWord + " and " + secondWord + " are equal");
			return;
		}
		
		//Runs if they are different
		System.out.print(firstWord + " comes " + result + secondWord + " in the alphabet");
	}
}
