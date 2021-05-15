//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

public class LastFirst
{
	public static String check( String s)
	{
   
     char g = s.charAt(s.length() - 1 );
     String c = ""+g;  
     if ( s.charAt(s.length() - 1) == s.charAt(0) )
		{
      return "apluscompsci";
      } else if (s.compareTo(c) < 0)
      {
      return "compsci";
      } else if (s.compareTo(c) > 0)
      {
      return "aplus";
      }
      return "";
      
	}
}