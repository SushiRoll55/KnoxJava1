//Knox, Caden
//November 2023
//CS A170
//Chapter 8 Lab 1

/**
 * @author cknox17
 * This demo class creates some example tally counters and uses methods from the TallyCounter class
 */
public class TallyCounterDemo {

	public static void main(String[] args) {
		//Initialize tally counters
		TallyCounter concert = new TallyCounter();
		TallyCounter bus = new TallyCounter();
		
		//Set counters
		concert.setColor("Blue");
		bus.setColor("Yellow");
		
		//Display concert details
		concert.displayColor();
		concert.displayCounter();
		
		//Display bus details
		bus.displayColor();
		bus.displayCounter();
		
		//Increment the concert counter 5 times
		for (int i = 0; i < 5; i++) {
			concert.increaseCounter();
		}
		
		//Display concert counter
		concert.displayCounter();
	}
}
