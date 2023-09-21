//Knox, Caden
//September 21, 2023
//CS A170
//Chapter 3 Lab 1

import java.util.Scanner;

public class RichterReading2 {

	public static void main(String[] args) {
		//Initialize scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt for richter reading
		System.out.println("Enter the richter reading: ");
		double reading = n.nextDouble();
		
		//Initialize result string
		String result = "";
		
		//Check for each case
		if (reading <= 0 || reading > 10) {
			result = "Invalid reading";
		}
		if (reading >= 8 && reading <= 10) {
			result = "Most structures fall";
		}
		if (reading >= 7 && reading < 8) {
			result = "Many buildings destroyed";
		}
		if (reading >= 6 && reading < 7) {
			result = "Many buildings considerably damaged, some collapse";
		}
		if (reading >= 4.5 && reading < 6) {
			result = "Damage to poorly constructed buildings";
		}
		if (reading < 4.5 && reading > 0){
			result = "Little to no damage";
		}
		
		//Print result
		System.out.print(result);
	}
}
