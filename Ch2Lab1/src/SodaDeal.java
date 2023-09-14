
public class SodaDeal {

	public static void main(String[] args) {
		int cansPerPack = 6;
		
		final double CAN_VOLUME = 0.335;
		final double BOTTLE_VOLUME = 2;
		
		double total;
		
		total = cansPerPack * CAN_VOLUME;
		
		total = total + BOTTLE_VOLUME;
		
		System.out.println("Total volume:");
		System.out.print(total + " liters");
	}

}
