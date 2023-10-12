//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 2

public class EvenNumbersToFifty {
	
	public static void main(String[] args) {
		//Constants
		final int LOOP_COUNT = 50;
		
		//Print start of result
		System.out.print("The result of all the even numbers between 0 and 50 is ");
		
		//Declare result
		int result = 0;
		
		//Loop based on loop count
		for (int i = 0; i <= LOOP_COUNT; i++) {
			//If i is even
			if (i % 2 == 0) {
				//Add even number to result string
				result += i;
			}
		}
		//Print result
		System.out.print(result + ".");
	}
}
