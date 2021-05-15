//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan 

public class LeapYear
{
	public static boolean isLeapYear( int year )
	{ 
     if (year % 100 != 0 && year % 4 == 0  )
     {
     return true;
     } 

     else if ( year % 400 == 0)
     {
     return true ;
     }
     
		return false ;
	}
}