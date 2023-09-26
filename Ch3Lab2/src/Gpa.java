//Knox, Caden
//September 26, 2023
//CS A170
//Chapter 3 Lab 2

import java.util.Scanner;

public class Gpa {

	public static void main(String[] args) {
		//Init scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for letter grade
		System.out.print("What is your letter grade: ");
		char grade = n.next().charAt(0);
		
		//Declare result string
		String result = "";
		
		/*
		//Check value of grade and assign result with correct value
		if (grade == 'A' || grade == 'a') {
			result = "4.0";
		}
		else if (grade == 'B' || grade == 'b') {
			result = "3.0";
		}
		else if (grade == 'C' || grade == 'c') {
			result = "2.0";
		}
		else if (grade == 'D' || grade == 'd') {
			result = "1.0";
		}
		else if (grade == 'F' || grade == 'f') {
			result = "0";
		}
		else {
			result = "invalid entry";
		}
		*/
		
		//Check value of grade and assign result with correct value
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
			result = "invalid entry";
		}
		//Print result
		System.out.print("Your GPA is: " + result);
		
	}
}