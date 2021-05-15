//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

public class AB
{
	public static boolean check( String s, String a, String b)
	{
	
 
     
     int i = s.indexOf(a);
     int p = s.indexOf(b);
     int u = s.lastIndexOf(a);
     int q = s.lastIndexOf(b);
     if ((i - p) == 1)
     {
   	return true ;
	  }else if ((u - q) == 1 || (u - q) == -1)
     {
     return true;
     }
   
   return false ; 
    }
}