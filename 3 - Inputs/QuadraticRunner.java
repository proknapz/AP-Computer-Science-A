//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.util.Scanner;
import static java.lang.System.*;


public class QuadraticRunner
{
  public static void main( String[] args ) 
  {

Scanner keyboard = new Scanner( System.in );
for (int k = 1; k <= 3; k++)
{
		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();

		
		Quadratic test = new Quadratic();
		System.out.println(String.format("%.2f", test.getRootOne( quadA,quadB,quadC ) ) );
		System.out.println(String.format("%.2f", test.getRootTwo( quadA,quadB,quadC ) ) );
}



  }
}