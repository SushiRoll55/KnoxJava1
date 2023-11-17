//Caden Knox and Jeffrey Truong
//November 2023
//CS A170
//Porject Three Task Two: ArrayLists

import java.util.*;

/**
 * @author Truong, Jeffrey
 * @author Knox, Caden
 * 
 *  November 14, 2023
 *  
 *  CS A170
 * 	Proj 3
 * 	
 */

public class StudentDirectory {

	//Init static scanner
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Init students array list
		ArrayList<String> names = new ArrayList<>();
		
		//Init grades array list
		ArrayList<Integer> grades = new ArrayList<>();
		
		//Declare variable for input
		int inputChoice;
		
		//Declare variable to determine if we want the program to keep running
		boolean runProgram = true;
		
		//While variable above is true
		while (runProgram) {
			//Print menu
			printMenu();
			
			//Prompt user with number option
			System.out.print("Select an option: ");
			inputChoice = in.nextInt();
			
			//Check value of input and run coresponding funcion
			switch(inputChoice) {
			case 1:
				addStudent(names, grades);
				break;
			case 2:
				removeStudent(names, grades);
				break;
			case 3:
				listStudents(names, grades);
				break;
			case 4:
				printDeansList(names, grades);
				break;
			case 5:
				runProgram = false;
				System.out.print("Exiting the program. Goodbye!");
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
	
	/**
	 * This method prints a numbered list of functionalities of this program
	 */
	public static void printMenu() {
		System.out.print("Orange Coast College Student Directory \n" +
						   "-------------------------------------- \n" +
						   "1. Add Student and Grade \n" +
						   "2. Remove Student \n" +
						   "3. List Students \n" +
						   "4. Dean's List \n" +
						   "5. Exit \n"
						   );
	}
	
	/**
	 * This method allows the user to add a new student to the list with a unique grade
	 * @param names of the students
	 * @param grades of the students
	 */
	public static void addStudent(ArrayList<String> names, ArrayList<Integer> grades) {
		//Prompt for name
		System.out.print("Enter the student's name: ");
		String name = in.next();
		
		//Prompt for grades
		System.out.print("Enter the student's grade: ");
		int grade = in.nextInt();
		
		//Add name and grade to array list
		names.add(name);
		grades.add(grade);
		
		//Print confirmation method
		System.out.println(name + " with grade " + grade + " added to the list.");
	}
	
	/**
	 * This method allows the user to remove a student based on a name
	 * @param names of the students
	 */
	public static void removeStudent(ArrayList<String> names, ArrayList<Integer> grades) {
		//Prompt for name
		System.out.print("Enter the student's name to remove: ");
		String name = in.next();
		
		//Iterate through names and try to find the name
		for (int i = 0; i < names.size(); i++) {
			if (name.equalsIgnoreCase(names.get(i))) {
				names.remove(i);
				grades.remove(i);
				System.out.println(name + " has been removed from the list.");
				return;
			}
		}
		
		//If nothing has been found
		System.out.println(name + " was not found in the list.");
	}
	
	/**
	 * This method prints a list of all the students and their grades
	 * @param names of the students
	 * @param grades of the students
	 */
	public static void listStudents(ArrayList<String> names, ArrayList<Integer> grades) {
		System.out.print("Student list:");
		for (int i = 0; i < names.size(); i++) {
			System.out.print("\n" + names.get(i) + " - Grade: " + grades.get(i));
		}
		System.out.println();
	}
	
	/**
	 * This method prints a list of all the students whose grades are 90 or above
	 * @param names of the students
	 * @param grades of the students
	 */
	public static void printDeansList(ArrayList<String> names, ArrayList<Integer> grades) {
		System.out.print("Dean's list:");
		for (int i = 0; i < names.size(); i++) {
			if (grades.get(i) >= 90) {
				System.out.print("\n" + names.get(i) + " - Grade: " + grades.get(i));				
			}
		}
		System.out.println();
	}

}
