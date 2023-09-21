//Knox, Caden
//September 21, 2023
//CS A170
//Chapter 3 Lab 2

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for month
		System.out.print("Enter a month (1-12) and I will print the number of the days in that month: ");
		int month = n.nextInt();
		
		//Initialize result string
		String result = "";
		
		//Check for month and assign result accordingly
		switch(month)
		{
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				result = "31";
				break;
			
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				result = "30";
				break;
			
			case 2 :
				result = "28 or 29";
				break;
				
			default: result = "invalid";
		}
		
		if (!result.equals("invalid")) {
			System.out.print("This month has " + result + " days");
		}
		else {
			System.out.print("Invalid Month");
		}
	}
}
