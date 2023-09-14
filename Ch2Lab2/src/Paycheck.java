//Knox, Caden
//September 14, 2023
//CS A170
//Chapter 2 Lab 2

import java.util.Scanner;

public class Paycheck {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive weekly hours
		Log("How many hours did you work this week? ");
		double weeklyHours = n.nextDouble();
		
		//Prompt for and receive over time hours
		Log("How many hours overtime? ");
		double overTimeHours = n.nextDouble();
		
		//Prompt for and receive pay rate
		Log("What is your hourly wage? ");
		double payRate = n.nextDouble();
		
		//Calculate overtime pay rate by halving it
		double overTimePayRate = payRate/2;
		
		//Calculate paycheck and print it
		double payCheck = (weeklyHours * payRate) + (overTimeHours * overTimePayRate);
		System.out.printf("This week I worked 45 hours and my paycheck is $%.2f", payCheck);
		
	}

	//Shorter print line method
	public static void Log(String input) {
		System.out.print(input);
	}
}
