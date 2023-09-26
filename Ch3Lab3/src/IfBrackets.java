//Knox, Caden
//September 26, 2023
//CS A170
//Chapter 3 Lab 3

import java.util.Scanner;

public class IfBrackets {
	public static void main(String[] args)
	{
		double fuelgauge = 0;
		
		System.out.println("enter the fuel gauge reading");
		Scanner input = new Scanner(System.in);
		
		fuelgauge = input.nextDouble();
		System.out.println("first with braces");
		
		if (fuelgauge < 0.75)
		{
			if (fuelgauge < 0.25)
				System.out.println("fuel is very low caution!");
		}
		else
		{
			System.out.println("fuel over 3/4. Don't stop now!");
		}
		
		System.out.println("now without braces");
		if (fuelgauge < 0.75)
			if (fuelgauge < 0.25)
				System.out.println("fuel is very low caution!");
		else
			System.out.println("fuel over 3/4. Don't stop now!");
	}
}
