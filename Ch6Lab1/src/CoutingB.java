//Knox, Caden
//October 31, 2023
//CS A170
//Chapter 6 Lab 1

public class CoutingB {

	public static void main(String[] args) {
		int[] arr = {4,0,7,2,11,6,0,3,0,9};
		System.out.println("This array contains " + zerosInArray(arr) + " zeros.");
		System.out.println("This array contains " + oddsInArray(arr) + " odd numbers.");
	}
	
	public static int zerosInArray(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num == 0) { count++; }
		}
		return count;
	}
	
	public static int oddsInArray(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num % 2 != 0) { count++; }
		}
		return count;
	}
}
