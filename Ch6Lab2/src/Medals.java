//Knox, Caden
//October 31, 2023
//CS A170
//Chapter 6 Lab 1

public class Medals {

	public static String[] COUNTRIES = { "Canada", "China", "Germany", "Korea", "Japan", "Russia", "United States" };
	
	public static void main(String[] args) {
		int[][] medals =
		{
			{ 1, 0, 1 },
			{ 1, 1, 0 },
			{ 0, 0, 1 },
			{ 1, 0, 0 },
			{ 0, 1, 1 },
			{ 0, 1, 1 },
			{ 1, 0, 0 }
		};

		System.out.printf("%15s%15s%15s%15s%15s", "Country", "Gold", "Silver", "Bronze", "Total");
		for (int i = 0; i < COUNTRIES.length; i++) {
			System.out.printf("\n%15s", COUNTRIES[i]);
			for (int j = 0; j < medals[i].length; j++) {
				System.out.printf("%15d", medals[i][j]);
			}
			totalMedals(medals, i);
		}
	}
	
	public static void totalMedals(int[][] nums, int row) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += nums[row][i];
		}
		System.out.printf("%15d", sum);
	}
}
