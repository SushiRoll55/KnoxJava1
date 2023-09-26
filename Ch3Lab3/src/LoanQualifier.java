//Knox, Caden
//September 26, 2023
//CS A170
//Chapter 3 Lab 3

import java.util.Scanner;

public class LoanQualifier {

	public static void main(String[] args) {
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for salary
		System.out.println("Enter your salary:");
		int salary = n.nextInt();
		
		//Prompt for years on job
		System.out.println("Enter years on the job:");
		int yearsOnJob = n.nextInt();
		
		if (salary >= 40000) { //Salary requirement met
			if (yearsOnJob >= 2) { //Year requirement met
				System.out.print("You qualify for a loan");
			}
			else { //Year requirement not met
				System.out.print("Minimum years at current job not met");
			}
		} else { //Salary requirement not met
			System.out.print("Minimum salary requirement not met");
		}
	}
}
