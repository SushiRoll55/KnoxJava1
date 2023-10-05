//Knox, Caden
//October 5, 2023
//CS A170
//Chapter 4 Lab 1

public class InvestmentRate {

	public static void main(String[] args) {
		//Declare constants
		final double INTEREST_RATE = 0.07;
		final double BALANCE_GOAL = 20000;
		
		//Declare variables for balance and year count
		double balance = 10000;
		int years = 0;
		
		//Loop while balance is less than goal
		while (balance < BALANCE_GOAL) {
			balance += (balance * INTEREST_RATE); //Increment balance based on interest rate
			years++; //Increment year count
		}
		
		//Print result
		System.out.print("The investment doubled after " + years + " years.");
	}
}
