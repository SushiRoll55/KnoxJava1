//Caden and Willis
//October 2023
//CS A170
//Project Two Version Two (with methods)

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Pizza Order Project
 * @author Caden and Willis
 */
public class PizzaOrder {
  //Static constants
  final static int PIZZA_COUNT = 4;
  final static int INITIAL_PIZZA_SIZE = 10;
  final static int SIZE_INCREMENT = 2;
  final static double PRICE_SIZE_DIFF = 0.99;
  final static double TOPPING_PRICE = 1.25;
  final static double TAX =  0.0795;
  final static String OWNER1 = "Caden";
  final static String OWNER2 = "Willis";

  //Init scanner
  final static Scanner in = new Scanner(System.in);

  /**
  *This is the main method
  *@param args string args
  */
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Welcome to Caden and Willis’s Pizzeria");

    //Prompt for name
    String name = promptWord("Enter your first name: ");
    
    //Discount eligibility
    boolean hasDiscount = eligibility(name);
    if (hasDiscount) {
    	JOptionPane.showMessageDialog(null, "You are eligible for a $2.00 discount.");
    }

    //Display pizzas
    displayPizzas();
    
    //Prompt for pizza size
    int pizzaSize = promptInt("What size pizza would you like?\n10, 12, 14, or 16 (enter the number only): ");
    
    //Calculate crust cose
    double crustCost = crustCost(pizzaSize);

    //Prompt for Crust type
    String crustSelection = promptWord("What type of crust do you want?\n" + 
                                           "(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");

    //Assign crust type
    String crustType = assignCrustType(crustSelection);
    
    //Display toppings
    JOptionPane.showMessageDialog(null, "All All pizzas come with cheese.\n" +
                       "Additional toppings are $" + TOPPING_PRICE + " each, choose from:\n" +
                       "Pepperoni, Sausage, Onion, Mushroom");
    
    //Prompt for toppings
    String toppings = getToppings();
    
    //Set topping count to length of split toppings string
    int toppingsCount = toppings.split(" ").length;

    //Calculate cost
    double cost = crustCost + (toppingsCount*TOPPING_PRICE);
    double total = cost + (cost*TAX);
    if (hasDiscount){
      total -= 2;
    }
    
    JOptionPane.showMessageDialog(null, "Your receipt will be printed in the console");

    //Print reciept
    receipt(pizzaSize, crustType, toppings, cost, TAX, total);
    
    //Exit program
    System.exit(0);
  }
  
  /**
  *This method displays each pizza with the correct amount, sizes, and prices
  */
  public static void displayPizzas(){
    String str = "Pizza Size(inches)     Cost\n";
    for (int i = 0; i < PIZZA_COUNT; i++)
    {
      int currentPizzaSize = INITIAL_PIZZA_SIZE + (i*SIZE_INCREMENT);
      str += String.format("          %d                      $%.2f\n", currentPizzaSize, currentPizzaSize + PRICE_SIZE_DIFF);
    }
    JOptionPane.showMessageDialog(null, str);
  }

  /**
  *This method prompts the user for an integer
  *@param prompt the prompt that will be displayed
  *@return the inputted integer
  */
  public static int promptInt(String prompt){
    //System.out.print(prompt);
    //return in.nextInt();
	String val = JOptionPane.showInputDialog(prompt);
	return Integer.parseInt("0" + val); //Add zero to avoid error
  }

  /**
  *This method prompts the user for a word/string character
  *@param prompt the prompt that will be displayed
  *@return the word they entered
  */
  public static String promptWord(String prompt){
	return JOptionPane.showInputDialog(prompt);
  }
  
  /**
   *This method determines if consumer receives discount
   *@param name the name of the user
   *@return true if they're name is an owner, otherwise false
   */
   public static boolean eligibility(String name){
     return name.equalsIgnoreCase(OWNER1)||name.equalsIgnoreCase(OWNER2);
   }

  /**
   * This method assigns the correct crust cost based on user choice
   * @param pizzaSize the size that the use enters
   * @return the coresponding crust cost as a double
   */
  public static double crustCost(int pizzaSize) {
	  //Create crust sizes
	  double[] sizes = new double[PIZZA_COUNT-1];
	  for (int i = 0; i < sizes.length; i++) {
		  sizes[i] = 12.0 + PRICE_SIZE_DIFF * i;
	  }
	  
	  if (pizzaSize == 10) {
		  return sizes[0];
	  }
	  else if (pizzaSize == 12) {
		  return sizes[1];
	  }
	  else if (pizzaSize == 14) {
		  return sizes[2];
	  }
	  else if (pizzaSize == 16) {
		  return sizes[3];
	  }
	  else {
		  JOptionPane.showMessageDialog(null, "That's not one of the choices, so a 12 inch pizza will be made.");
		  return sizes[1];
	  }
  }
  
  /**
  *This method checks user's input for crust type and assigns it to a new string
  *@param crustType the crust type that the user inputs
  *@return a string that coresponds to the user's input
  */
  public static String assignCrustType(String crustType){
    switch(crustType.toLowerCase())
    {
      case "h":
        return "Hand-tossed";
      case "t":
        return "Thin-crust";
      case "d":
        return "Deep-dish";
      default:
    	String newType = promptWord("Invalid selection, please try again\n(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D)");
        return assignCrustType(newType);
    }
  }

  /**
  *This method prompts the user for an array of toppings to choose from
  *@return the string of toppings the user chose
  */
  public static String getToppings(){
    String toppings = "";
    String[] toppingOptions = {"Pepperoni", "Sausage", "Onion", "Mushroom"};
    for (int i = 0; i < toppingOptions.length; i++) //Iterate through options for toppings
    {
      toppings += selectTopping(toppingOptions[i]);
    }
    return toppings;
  }
  
  /**
  *This method prompts the user for a topping
  *@param topping the topping they are being prompted to add
  *@return the topping as a string if they enter "y"
  */
  public static String selectTopping(String topping){
    //System.out.print("Do you want " + topping + "? (Y/N): ");
	String choice = promptWord("Do you want " + topping + " ? (Y/N)");
	if (choice.equalsIgnoreCase("y")){
    //if (in.next().equalsIgnoreCase("y")){
      return topping + " ";
    }
    else{
      return "";
    }
  }
  
  /**
  *This method displays final reciept of order
  *@param pizzaSize the crust size as an int
  *@param crustType the crust type as a single character string
  *@param toppings the toppings as a string
  *@param cost the cost of the order
  *@param tax the tax of the order
  *@param total the total cost of the order (including tax)
  */
  public static void receipt(int pizzaSize, String crustType, String toppings, double cost, double tax, double total){
    System.out.print("Your order is as follows:\n" +
                      pizzaSize + "-inch pizza\n" +
                      crustType + " crust\n" +
                      toppings + "\n");
    System.out.printf("The cost of your order is: $%.2f\n", cost);
    System.out.printf("The tax is: $%.2f\n", cost*tax);
    System.out.printf("The total due is: $%.2f\n",total);
    System.out.println("Your order will be ready for pickup in 30 minutes.");
    
  }
  
}