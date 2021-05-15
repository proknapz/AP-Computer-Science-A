//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 2/12/2021

import java.util.List;
import java.util.ArrayList;

public class ListNoRepeats
{
	//method go will return true if there
	//are no numbers that repeat
	//false if any numbers repeat
	public static boolean go( List<Integer> ray )
	{
   for( int x = 0; x < ray.size(); x++)
   for( int y = x + 1; y < ray.size(); y++)
   if(x != y && ray.get(x) == ray.get(y))
   return false;
   
   return true; 
	}
}