public class HelloUniverse
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		System.out.println(3+4);
		System.out.println("Hello");
		System.out.println("World");
		System.out.println("Hello Caden");
		final String WORD = "Hello";
		for(int i = 0; i < WORD.length(); i++) {
			System.out.println(WORD.charAt(i));
		}
		//Original code result: My lucky number is12
		//Improved version:
		System.out.println("My lucky number is " + (3+4+5));
	}
}