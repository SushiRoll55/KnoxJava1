//Knox, Caden
//November 2, 2023
//CS A170
//Chapter 6 Lab 3

import java.util.*;

public class Friends {

	public static void main(String[] args) {
		//Init array list
		ArrayList<String> friends = new ArrayList<>();
		
		//Add each friend to friends list
		friends.add("Carrie");
		friends.add("Bob");
		friends.add("Ali");
		friends.add("Sarah");
		friends.add("Ellen");
		
		//Add richard to list
		friends.add(4, "Richard");
		
		//Set last element to Ellie
		friends.set(friends.size()-1, "Ellie");
		
		//Get last element and print it
		System.out.println("The last name on the list is: " + friends.get(friends.size()-1));
		
		//Remove first name of list
		friends.remove(0);
		
		//Print size of list
		System.out.println("The size of your array list is: " + friends.size());
		
		//Print without loop
		System.out.println("The friends list without a loop: " + friends);
		
		//Print with loop
		System.out.print("The friends list with a loop: ");
		for (String name : friends) {
			System.out.print(name + " ");
		}
	}
}
