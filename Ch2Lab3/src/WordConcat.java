//Knox, Caden
//September 19, 2023
//CS A170
//Chapter 2 Lab 3

import java.util.Scanner;

public class WordConcat {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive a string
		System.out.print("Enter a string: ");
		String str = n.nextLine();
		
		//Get first and last chars
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		//Replace first character
		str = lastChar + str.substring(1, str.length());
		
		//Replace second character
		str = str.substring(0, str.length()-1) + firstChar;
		
		//Print result
		System.out.print(str);
	}
}
