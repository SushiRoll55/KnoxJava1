//Knox, Caden
//October 31, 2023
//CS A170
//Chapter 6 Lab 1

import java.util.Scanner;

public class ReverseArray {

	public static Scanner in = new Scanner(System.in);
	public static String SENTINEL = ".";
	
	public static void main(String[] args) {
		System.out.print("Enter upto 10 characters and end with a period:");
		char[] symbols = getCharArray(10);
		
		if (symbols[0] != 0) {
			System.out.print("The characters in reverse order are:");
			printCharacters(reversedCharArray(symbols));
		} else
		{
			System.out.println("The array is empty");
		}
	}
	
	public static char[] getCharArray(int maxSize) {
		String[] input = in.nextLine().split(" ");
		char[] symbols = new char[maxSize];
		
		for (int i = 0; i < symbols.length; i++) {
			if (input[i].equals(SENTINEL)) { break; }
			symbols[i] = input[i].charAt(0);
		}
		
		return symbols;
	}
	
	public static char[] reversedCharArray(char[] arr) {
		char[] reversedArr = new char[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			reversedArr[i] = arr[arr.length - (1+i)];
		}
		
		return reversedArr;
	}
	
	public static void printCharacters(char[] arr) {
		for (char c : arr) {
			if (c != 0) { System.out.print(c + " "); };
		}
	}
}
