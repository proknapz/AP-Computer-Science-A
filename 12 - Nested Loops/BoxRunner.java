//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;
import java.util.Scanner;

public class BoxRunner
{
   public static void main( String args[] )
   {
   
      Scanner keyboard = new Scanner(System.in);
   	String choice="";
      
         out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();

         System.out.println( Box.go( big ) );

	}
}