//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class BigOrSmall
{
	public static String check( int a, int b )
	{ 
      
      if ( a > b && (a % 2) != 0){
		return "yes";
      }else if (b > a && (b % 2) != 0){
      return "no";
      }else if(a == b && (a + b) % 2 == 0){
      return "aplus";
      }else{
      return "compsci";
      }

      
	}
}