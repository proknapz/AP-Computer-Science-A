//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class Factorial
{
	public static long getFactorial( int num )
	{
		long factorial=1;
      for (int x = 1; x <= num; x++)
      {
      factorial*=x;
      }
		return factorial;
	}
}