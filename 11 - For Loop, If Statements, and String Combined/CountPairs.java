//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan


import static java.lang.System.*; 

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
      
		int count = 0;
      for (int x = 0; x <= str.length() - 2; x++)
      {
      if (str.charAt(x) == str.charAt(x + 1))
      count++;
      }
     
		return count;
	}
}