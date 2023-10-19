//Knox, Caden
//October 19, 2023
//CS A170
//Chapter 5 Lab 1

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		//init scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt for first int
		System.out.print("Input an integer: ");
		square1(in.nextInt());
		
		//Prompt for second int
		System.out.print("Input an integer: ");
		System.out.println("The result is " + square2(in.nextInt()));
	}
	
	static void square1(int num) {
		System.out.println("The result is " + (num*num));
	}
	
	static int square2(int num) {
		return num * num;
	}
}
