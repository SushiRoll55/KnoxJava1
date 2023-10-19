//Knox, Caden
//October 10, 2023
//CS A170
//Chapter 4 Lab 3

public class DiceRolls {

	public static void main(String[] args) {
		//Constants
		int ROLL_COUNT = 10;
		int DICE_SIDES = 6;
		
		//Roll dice ROLL_COUNT times
		for (int i = 0; i < ROLL_COUNT; i++) {
			//Get and print random number
			int num = (int)Math.floor(Math.random() * DICE_SIDES + 1);
			System.out.println(num);
		}
		System.out.println(Math.random() * 6);
	}
}
