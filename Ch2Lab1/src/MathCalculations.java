public class MathCalculations {

	public static void main(String[] args) {
		//Variable declaration
		byte a;
		short b;
		int c;
		long d;
		
		float x;
		float y;
		
		double result;
		
		//Equation 1
		x = 5f;
		a = 2;
		result = x + Math.pow(x, a);
		printEquation((short)1, result);
		
		//Equation 2
		x = -17f;
		b = 55;
		result = Math.abs(x) + b;
		printEquation((short)2, result);
		
		//Equation 3
		x = 100f;
		c = 128;
		result = c * Math.sqrt(x);
		printEquation((short)3, result);
		
		//Equation 4
		x = 0.01f;
		y = 0.001f;
		result = Math.min(x, y) * 2;
		printEquation((short)4, result);
		
		//Equation 5
		x = 999999999.1f;
		d = 999999999;
		result = 100 + Math.max(x, d);
		printEquation((short)5, result);
		
		//Equation 6
		x = 9.5002f;
		b = 10;
		result = Math.round(x) * b;
		printEquation((short)6, result);
		
	}

	//Method to make printing easier
	public static void printEquation(short equationNum, double result) {
		System.out.println("The result of equation " + equationNum + " is " + result);
	}
}
