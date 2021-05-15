//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleThreeRunner
{
   public static void main( String args[] )
   {
   
      Scanner keyboard = new Scanner(System.in);
   	String choice="";
      
         out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();
 
         System.out.println( TriangleThree.go( big - 1, value ) );


   }
}