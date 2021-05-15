//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*; 

public class TriangleOne
{
	public static void print( String word )
	{
    
    for(int x = 0; x <= word.length(); x++)
    {
    System.out.println(word.substring(0,word.length() - x));
    }
   
	}
}