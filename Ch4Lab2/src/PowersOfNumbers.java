//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 2

public class PowersOfNumbers {

	public static void main(String[] args) {
		//Constants
		final int MIN = 10;
		final int MAX = 20;
		final int POWER_COUNT = 5;
		
		//Print powers
		for (int i = 1; i <= POWER_COUNT; i++) {
			System.out.printf("%-10s", "|  " + i);
		}
		System.out.println();
		
		//Print x's
		for (int i = 0; i < POWER_COUNT; i++) {
			System.out.printf("%-10s", "| x");
		}
		System.out.println();
		
		//Header bar
		System.out.println("|---------|---------|---------|---------|--------");
		
		//Loop based on min and max
		for(int i = MIN; i <= MAX; i+=2) {
			//Loop for each power
			for (int j = 1; j <= POWER_COUNT; j++) {
				//Print power
				System.out.print("| ");
				System.out.printf("%-8.0f", Math.pow(i, j));
			}
			System.out.println();
		}
	}
}
