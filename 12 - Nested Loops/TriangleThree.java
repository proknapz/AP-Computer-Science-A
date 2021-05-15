//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class TriangleThree
{
	public static String go( int size, String let )
	{
		String output="";
      for (int x=0; x<= size; x++)
      {
      for(int y=x;y<=size;y++)
      output+= " ";
      for(int z = x;z >= 0; z--)
      output+=let;
      output = output + "\n";
      }
		return output+"\n";
	}
}