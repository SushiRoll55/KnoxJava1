//Knox, Caden
//October 31, 2023
//CS A170
//Chapter 6 Lab 1

public class Initials {

	public static void main(String[] args) {
		char[] initials = {'C', 'J', 'K'};
		printInitials(initials);
	}
	
	public static void printInitials(char[] initials) {
		for (int i = 0; i < initials.length; i++) {
			System.out.print(initials[i]);
		}
	}
}
