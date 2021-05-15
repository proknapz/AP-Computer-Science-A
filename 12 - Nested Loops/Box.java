//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class Box
{
	public static String go( int size )
	{
		String output="";
      for(int x = 1; x <= size; x++)
      {
         for(int y = x; y <= size; y++)
         output += "*";
         for(int z = x; z > 0;z--)
         output += "#";
         output = output + "\n";
          
      }
		return output+"\n";
	}
}