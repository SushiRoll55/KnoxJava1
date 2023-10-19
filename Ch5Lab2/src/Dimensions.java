//Knox, Caden
//October 19, 2023
//CS A170
//Chapter 5 Lab 2

import java.util.Scanner;

public class Dimensions {

	public static void main(String[] args) {
		//Init scaner
		Scanner in = new Scanner(System.in);
		
		//Prompt for dimensions
		System.out.println("Please enter the length, width and height dimensions:");
		
		//Get dimensions
		double l = in.nextDouble();
		double w = in.nextDouble();
		double h = in.nextDouble();
		
		//Calculate and print volumes
		System.out.println("The volume of the cube is: " + cubeVolume(l));
		System.out.println("The volume of the cube is: " + cubeVolume(w));
		System.out.println("The volume of the rectangular prism is: " + rectangularPrismVolume(l, w, h));
		
	}
	
	public static double cubeVolume(double a) {
		return a * a * a;
	}
	
	public static double rectangularPrismVolume(double l, double w, double h) {
		return l * w * h;
	}
}
