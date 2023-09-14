//Knox, Caden
//September 14, 2023
//CS A170
//Chapter 2 Lab 2

import java.util.Scanner;

public class DayConverter {

	public static void main(String[] args) {
		//Declare constants for values of hours, minutes, and seconds
		final int HOURS_PER_DAY = 24;
		final int MINUTES_PER_HOUR = 60;
		final int SECONDS_PER_MINUTE = 60;
		
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive number of days
		System.out.print("Enter a number of days: ");
		int days = n.nextInt();
		
		//Calculate hours from days
		int hours = days * HOURS_PER_DAY;
		
		//Calculate minutes from hours
		int minutes = hours * MINUTES_PER_HOUR;
		
		//Calculate seconds from minutes
		int seconds = minutes * SECONDS_PER_MINUTE;
		
		//Print days, hours, minutes, and seconds
		System.out.print(days + " days is " + hours + " hours or " + minutes + " minutes or " + 
		seconds + " seconds");
	}
}
