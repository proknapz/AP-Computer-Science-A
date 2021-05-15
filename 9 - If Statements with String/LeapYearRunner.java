//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.util.*;

public class LeapYearRunner
{
	public static void main( String args[] )
	{		
		Scanner keyboard = new Scanner(System.in);		
		System.out.print("Enter a year :: ");
		int year = keyboard.nextInt();
		//add test cases		
      LeapYear s = new LeapYear();
                 
     if (s.isLeapYear(year) == false)
     {
     System.out.println(year + " is NOT a leap year.");
     }else{
     System.out.println(year + " is a leap year.");
     }
      
      		
	}
}