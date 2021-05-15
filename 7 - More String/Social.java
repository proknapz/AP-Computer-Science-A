//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan



public class Social
{
   public static String go( String a )
	{
      if (a.charAt(3) == '-' && a.charAt(6) == '-')
      {
      String b = a.substring(7);
      return b;
      }   
		return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/