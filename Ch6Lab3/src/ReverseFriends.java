//Knox, Caden
//November 2, 2023
//CS A170
//Chapter 6 Lab 3

import java.util.*;

public class ReverseFriends {

	public static void main(String[] args) {
		//Init array list friends
		ArrayList<String> friends = new ArrayList<>();
		
		//Add each friend to friends
		friends.add("Allen");
		friends.add("Cindy");
		friends.add("Tran");
		friends.add("Jose");
		
		//Print friends list
		System.out.println("original array: " + friends);

		//Print reversed friends list
		System.out.println("reversed array: " + reverseArray(friends));
	}
	
	public static ArrayList<String> reverseArray(ArrayList<String> arr){
		//Init result list
		ArrayList<String> reversed = new ArrayList<>();
		
		//Iterate through array param backwards
		for (int i = arr.size()-1; i >= 0; i--) {
			reversed.add(arr.get(i)); //Add element at i to result
		}
		
		//Return result
		return reversed;
	}
}
