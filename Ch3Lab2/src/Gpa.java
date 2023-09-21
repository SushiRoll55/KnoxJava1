//Knox, Caden
//September 21, 2023
//CS A170
//Chapter 3 Lab 2

import java.util.Scanner;

public class Gpa {

	public static void main(String[] args) {
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for letter grade
		System.out.print("Enter your letter grade: ");
		char grade = n.next().charAt(0);
		
		//
		String result = "";
		
		//THIS IS FOR PART 2
		
		//
		switch(grade) {
			case 'A' :
			case 'a' :
				result = "4.0";
				break;
				
			case 'B' :
			case 'b' : 
				result = "3.0";
				break;
				
			case 'C' :
			case 'c' :
				result = "2.0";
				break;
				
			case 'D' :
			case 'd' :
				result = "1.0";
				break;
			
			case 'F' :
			case 'f' :
				result = "0";
			
			default :
				result = "invalid";
		}
	}

}
