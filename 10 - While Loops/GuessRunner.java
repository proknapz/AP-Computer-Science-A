//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
	public static void main(String args[])
	{  
      Scanner keyboard = new Scanner(System.in);
		//char response;
     
      
		int upperBound = 0;
      GuessingGame games = new GuessingGame(upperBound);
      games.playGame();

     
        
	}
}