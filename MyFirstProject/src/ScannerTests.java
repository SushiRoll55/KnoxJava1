import java.util.Scanner;

public class ScannerTests {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a thing");
		int count = in.nextInt();
		System.out.print(count);
	}

}
