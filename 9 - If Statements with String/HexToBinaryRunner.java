//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		HexToBinary prog = new HexToBinary();
		
		Scanner keyboard = new Scanner(in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);		
		out.println( prog.getBinary( letter ) );  
			
		//add more test cases
	}
}