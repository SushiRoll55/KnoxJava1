
//import java.util.Arrays;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Calculating {

	public static void main(String[] args) throws ScriptException {
		//Init Scanner
		Scanner in = new Scanner(System.in);
		
		//Init ScriptEngine
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("js");
		
		//Prompt for equation
		System.out.print("Enter the expressioon: ");
		Object result = engine.eval(in.nextLine());
	    System.out.println(result);
		
		
	}

}
