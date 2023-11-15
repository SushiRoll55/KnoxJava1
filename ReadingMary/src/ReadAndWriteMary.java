//Knox, Caden
//November 16, 2023
//CS A170
//Chapter 7 Lab 2

import java.io.*;
import java.util.*;

public class ReadAndWriteMary {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("Mary.txt");
		
		Scanner in = new Scanner(inputFile);
		
		PrintWriter out2 = new PrintWriter("lineOutput.txt");
		
		while(in.hasNextLine()) {
			out2.println(in.nextLine());
		}
		
		in.close();
		out2.close();
		
		Scanner in2 = new Scanner(inputFile);
		
		PrintWriter out3 = new PrintWriter("wordOutput.txt");
		
		while(in2.hasNext()) {
			out3.println(in2.next());
		}
		
		in2.close();
		out3.close();
		
		System.out.print("goodbye");
	}

}
