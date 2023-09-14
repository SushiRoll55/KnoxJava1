//Knox, Caden
//September 14, 2023
//CS A170
//Chapter 2 Lab 3

import java.util.Scanner;

public class CoinMachine {

	public static void main(String[] args) {
		//Initialize constants for money types
		final int DOLLAR = 100;
		final int QUAR = 25;
		final int DIME = 10;
		final int NICK = 5;
		final int PEN = 1;
		
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for and receive amount of pennies
		System.out.print("How many pennies do you have: ");
		int change = n.nextInt();
		
		//Calculate each type and update change
		int dollars = change / DOLLAR;
		change = change % DOLLAR;
		
		int quarters = change / QUAR;
		change = change % QUAR;
		
		int dimes = change / DIME;
		change = change % DIME;
		
		int nickles = change / NICK;
		change = change % NICK;
		
		int pennies = change / PEN;
		change = change % PEN;
		
		//Print results
		System.out.print("Your change is " + dollars + " dollar, " + quarters + " quarter, " +
		dimes + " dime, " + nickles + " nickles, and " + pennies + " pennies");
	}
}
