//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class AddSubMult
{
	public static double check( double a, double b )
	{
      if (a > b)
      {
		return a - b;
      }else if (b > a){
      return b - a;
      }   
      return a * b;
      
	}
}