//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
	
			//ask for ht
			out.print("Enter the ht :: ");
	   	int ht = keyboard.nextInt();

			//ask for wt
			out.print("Enter the wt :: ");
	   	int wt = keyboard.nextInt();

			//ask for age
	      out.print("Enter the age :: ");
	   	int age = keyboard.nextInt();

			//instantiate a new Monster() and add it to the herd			
		   //Monsters herd = new Monsters(ht, wt, age);
   		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
	   //System.out.println("SMALLEST :: "+herd+"\n");
      //System.out.println("LARGEST :: "+herd2+"\n");
	}		
}