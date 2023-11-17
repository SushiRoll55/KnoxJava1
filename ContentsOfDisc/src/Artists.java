//Knox, Caden
//November 16, 2023
//CS A170
//Chapter 7 Lab 1

import java.io.*;
import java.util.*;

public class Artists {

	public static void main(String[] args) throws FileNotFoundException {
		//Init file and assign it to a scanner
		File input = new File("Classics.txt");
		Scanner in = new Scanner(input);
		
		//Init output file
		PrintWriter out = new PrintWriter("output.txt");
		
		//Init String array
		String[] cd = new String[6];
		
		//Iterate through array and format each element
		for (int i = 0; i < cd.length; i++) {
			String song = in.nextLine();
			String author = in.nextLine();
			cd[i] = (song + " by " + author);
		}
		
		//Format result
		String result = "Contents of Compact Disc\n========================\n";
		for (String str : cd) {
			result += (str + "\n");
		}
		
		//Print result in console and output text
		System.out.print(result);
		out.print(result);
		
		//Close in n out
		in.close();
		out.close();
	}
}
