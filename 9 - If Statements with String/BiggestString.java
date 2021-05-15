//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan



public class BiggestString
{
	public static String getBiggest( String a, String b, String c )
	{  
     
      if( a.compareTo(b) > 0 && a.compareTo(c) > 0)
      {

      return a + " " + b + " " + c + "\nbiggest = " + a + "\n";
      }else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
      {

		return a + " " + b + " " + c + "\nbiggest = " + b + "\n";
      }else{

      return a + " " + b + " " + c + "\nbiggest = " + c + "\n";
	   }
   }
}