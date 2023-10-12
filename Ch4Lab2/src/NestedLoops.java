//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 2

public class NestedLoops {

	public static void main(String[] args) {
		//Constants
		final int CHARACTER_COUNT = 3;
		
		//Loop for character count
		for (int i = 0; i < CHARACTER_COUNT; i++) {
			//Loop twice
			for (int j = 0; j < 2; j++) {
				//Print body of character
				System.out.print("-*");
			}
			
			//Print last charcter and line break
			System.out.println("-");
		}
	}
}
