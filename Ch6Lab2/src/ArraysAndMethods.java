//Knox, Caden
//October 31, 2023
//CS A170
//Chapter 6 Lab 1

import java.util.Scanner;

public class ArraysAndMethods {

	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Initialize and populate array
		int[] numbers = new int[8];
		populateArray(numbers);
		System.out.print("The array elements are: ");
		printArray(numbers);
		
		//Print sum of each number in array
		System.out.println("The total of the array elements is " + summing(numbers));
		
		//Double array and print it
		doubling(numbers);
		System.out.print("The array elements doubled are: ");
		printArray(numbers);
		
		//Create array of even indices and print
		int[] evenIndices = evenElements(numbers);
		System.out.print("The elements of the even indices are: ");
		printArray(evenIndices);
	}
	
	public static void populateArray(int[] nums) {
		int[] arr = {5,0,7,2,11,16,0,21}; //Init array
		for (int i = 0; i < arr.length; i++) { //iterate through array
			nums[i] = arr[i]; //initialize ith element
		}
	}
	
	public static void printArray(int[] nums) {
		for (int num : nums) { //Iterate through nums
			System.out.print(num + " "); //print current num
		}
		System.out.println();
	}
	
	public static int summing(int[] nums) {
		int sum = 0;
		for (int num : nums) { //iterate through nums
			sum += num; //add current num to sum
		}
		return sum;
	}
	
	public static void doubling(int[] nums) {
		for (int i = 0; i < nums.length; i++) { //iterate through nums
			nums[i] *= 2; //double current num
		}
	}
	
	public static int[] evenElements(int[] nums) {
		int[] evenIndices = new int[4]; //init array of size 4
		int j = 0; //declare index for even number
		for (int i = 0; i < evenIndices.length; i++) {
			evenIndices[i] = nums[j]; //set even indices array to current even num
			j += 2; //increment by 2
		}
		return evenIndices;
	}

}
