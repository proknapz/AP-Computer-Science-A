//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleWordRunner
{
   public static void main(String args[])
   {	
   

   System.out.println("Enter a word: ");
   Scanner scan = new Scanner(System.in);
   String word = scan.nextLine();
   TriangleWord yo = new TriangleWord(word);
   System.out.println(yo.toString());
   
   
   
   
	}
}