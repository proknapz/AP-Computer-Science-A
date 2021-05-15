//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;

public class TriangleWord
{
   private String word;

   public TriangleWord(String w)
   {
      word=w;
   }
   
   public TriangleWord()
   {
      word="";
   }
 


   public String toString()
   { 
   
      String output = "";
      for (int a = word.length()-1; a >= 1; a--)
      {
         for (int b = 0; b < word.length() - 1; b++)
         {
            out.print(" ");
         }
         out.println(word.charAt(0));
      }
   
      for (int c = 0; c < word.length() * 2 - 1; c++)
      {
         out.print(word.charAt(word.length()-1-c));  
      }
      out.print(word.substring(1));   
      return output + "\n";
      
      /*  
   
   
   
   
   
   
   
   
   
        
      */
        
        
   
        
   }
}


