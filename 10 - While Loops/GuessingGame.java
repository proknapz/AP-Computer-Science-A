//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;



	public GuessingGame(int stop)
	{

	
	}



	public void playGame()
	{
   Scanner keyboard = new Scanner(System.in);
       System.out.print("Guessing Game - how many numbers? ");
		 upperBound = keyboard.nextInt();


   
   
	int randomNum = (int)(Math.random() * (upperBound - 1) + 1);
   int Guesses = 0;
		
		boolean Guess = true;
		
		while(Guess) { 		

			System.out.print("Enter a number between 1 and " + upperBound + " " );
			int guess = keyboard.nextInt();
				   	
			Guesses++;
			
			if(randomNum == guess){
				
				
            System.out.println("It took " + Guesses + " guesses to guess " + randomNum); 
            System.out.println("You guessed wrong " + (int)(100 * (Guesses - 1) / upperBound) + " percent of the time.");            
				Guess = false;
			}else if(guess < 1 || guess > upperBound){
			   System.out.println("Number out of range!");
            Guesses--;
            
			}else{

            }
		}

	}

	public String toString()
	{  
 
   
		String output="";
		return output;
	}
}