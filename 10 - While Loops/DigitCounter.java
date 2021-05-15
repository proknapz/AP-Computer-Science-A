//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class DigitCounter
{
   public static int go( int number )
	{

   
   int count = 0;
   while (number != 0)
   {
   number /= 10;
   ++count;
   
   }
   return count;

	}
}