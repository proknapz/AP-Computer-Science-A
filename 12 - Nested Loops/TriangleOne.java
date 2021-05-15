//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String go( String let, int size)
	{
		String output= "";
           for(int x = 1; x <= size; x++){
           output += "\n";
      for(int y = 1; y <= x; y++){
      
       output += let + "" ;
      }      }
      
      return output;
      

	}
}