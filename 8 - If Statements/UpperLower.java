//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

public class UpperLower
{
   public static String go( String a, boolean b )
	{  
    if (b == true)
     {	
     a = a.toUpperCase();
     return a;
     }
     a = a.toLowerCase();

     return a;
	}   
}