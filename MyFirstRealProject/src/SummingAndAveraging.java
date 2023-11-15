//Knox, Caden
//November 16, 2023
//CS A170
//Chapter 7 Lab 1

import java.io.*;
import java.util.*;

public class SummingAndAveraging {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("iahuhfuhajkfnsn.txt");
		
		Scanner in = new Scanner(inputFile);
		
		PrintWriter out2 = new PrintWriter("output.txt");
		
		int[] arr = new int[25];
		int sum = 0;
		
		System.out.println("Enter 25 integers");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		in.close();
		
		for (int num : arr) {
			out2.println(num);
		}
		out2.println("The sum is: " + sum);
		out2.println("The average is " + sum / arr.length);
		
		out2.close();
		
		System.out.print("Goodbye");
	}

}
