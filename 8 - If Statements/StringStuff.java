//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*; 
import java.util.Scanner;

public class StringStuff
{
	//add in a String instance variable named word
   private String word;

	//add in a constructor with one String parameter
	public StringStuff(String w)
   {
   word = w;
   }
   
	//add in a setString method with one String parameter
   public String setString( String w)
   {
   return word.substring(word.length() - 3);
   }
    
 	public boolean isEvenLength()
 	{
      int m = word.length();
      if ( m % 2 == 0)
      return true;
      
		return false;
	}
	
	public boolean endsWith( String b )
	{  
     if (b == "cat")
 		return true;
      
      return false;
			
	}
	
 	public boolean sameFirstLastLetters()
 	{  
      if (word.charAt(0) == word.charAt(word.length() - 1))
 	 	return true;
      
      return false;
	}	

 	public String toString()
 	{
    return "";
	}
   

}