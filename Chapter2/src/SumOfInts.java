import java.util.Scanner;

public class SumOfInts {

	public static void main (String[] args) {
		//Add a scanner
		Scanner n = new Scanner(System.in);
		
		//Prompt user and read input
		Log("First int: ");
		int num1 = n.nextInt();
		Log("Second int: ");
		int num2 = n.nextInt();
		
		//Declare and process result
		int result = num1 + num2;
		Log("The sum of " + num1 + " and " + num2 + " is " + result);
	}

	//Method to make printing easier
	public static void Log(String input) {
		System.out.println(input);
	}
}
