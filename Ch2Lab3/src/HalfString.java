//Knox, Caden
//September 19, 2023
//CS A170
//Chapter 2 Lab 3

import java.util.Scanner;

public class HalfString {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive string
		System.out.print("Please enter an even length string: ");
		String str = n.nextLine();
		
		//Check if the string length is even
		if (str.length() % 2 == 0)
		{
			//Cut str in half and print
			str = str.substring(0, str.length()/2);
			System.out.print(str);
		}
		else
		{
			System.out.print("String is not even, try again");
		}
	}
}
