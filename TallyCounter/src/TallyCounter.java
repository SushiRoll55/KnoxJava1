//Knox, Caden
//November 2023
//CS A170
//Chapter 8 Lab 1

/**
 * @author cknox17
 * This class is used to keep a number count
 */
public class TallyCounter {
	private int counter = 0;
	private String color;
	
	/**
	 * Increments counter by 1
	 */
	public void increaseCounter() {
		this.counter++;
	}
	
	/**
	 * Prints value of counter
	 */
	public void displayCounter() {
		System.out.println(counter);
	}
	
	/**
	 * Prints color
	 */
	public void displayColor() {
		System.out.println(color);
	}
	
	/**
	 * Sets color to a new color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Sets the counter to a number
	 * @param count
	 */
	public void setCounter(int count) {
		this.counter = count;
	}
	
	/**
	 * Gets the color
	 * @return this color
	 */
	public String getColor() {
		return this.color;
	}
	
	/**
	 * Gets the count
	 * @return this count
	 */
	public int getCount() {
		return this.counter;
	}
}
