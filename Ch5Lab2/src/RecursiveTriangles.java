//Knox, Caden
//October 24, 2023
//CS A170
//Chapter 5 Lab 2

import java.util.Scanner;

public class RecursiveTriangles {

	public static void main(String[] args) {
		//Init scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt for sides of triangle
		System.out.println("Please enter an integer value:");
		int sides = in.nextInt();
		
		//Print a triangle with a size based on input
		printTriangles(sides);
	}
	
	public static void printTriangles(int sides) {
		if (sides < 1) {
			return;
		}
		printTriangles(sides - 1);
		for(int i = 0; i < sides; i++) {
			System.out.print("[]");
		}
		System.out.println("");
	}
}
