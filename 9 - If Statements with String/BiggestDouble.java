//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

public class BiggestDouble
{
	public static double getBiggest( double a, double b, double c, double d )
	{
      if( a > b && a > c && a > d)
      {
      return a;      
      }else if( b > a && b > c && b > d)
      {
		return b;
      }else if( c > a && c > b && c > d){
      return c;
      }else{
      return d;
      }
    
	}
}