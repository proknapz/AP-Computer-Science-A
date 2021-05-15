//(c) A+ Comput Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*; 

public class VowelCounter
{
	public static String getNumberString( String s)
	{ 
      int count = -1;
      for( int x = 0; x < s.length(); x++)
      {
           char letter = s.charAt(x);
           if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')      
           {
                
            count++;

                       s = s.replace(letter,(count+"").charAt(0));

 
           }
      }
	return ""+s;
    

	}
}

