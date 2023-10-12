//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 2

import java.util.Scanner;

public class AverageSalary {

	public static void main(String[] args) {
		//Constants
	    final int SENTINEL = -1;
	    
	    //Init scanner
	    Scanner n = new Scanner(System.in);
	    
	    int salary = 0; //Tracks current inputted salary
	    int sum = 0; //Tracks sum of salaries
	    int counter = -1; //Tracks how many times user inputted a salary
	    
	    //Prompt for salaries
        System.out.print("Enter your salaries, or enter -1 to terminate:\n");
	    //If sentinal is not read
	    while (salary != SENTINEL)
	    {
	    	//Add salary to sum
	        sum += salary;
	        
	        //Increment counter
	        counter++;
	        
	        //Print label
	        System.out.print("wk" + (counter+1) + "     ");
	        
	        //Get salary from input
	        salary = n.nextInt();
	    }
	    
	    //Check to avoid dividing by zero
	    if (counter > 0)
	    {
	        //Calculate and print result
	        double average = ((double)sum / (double)counter);
	        System.out.printf("Your average salary is $%.2f", average);
	    }
	    else
	    {
	        //Error
	        System.out.print("Enter at least one salary to calculate average");
	    }
	}
}
