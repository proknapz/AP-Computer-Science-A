//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int n, int s)
	{
    number = n;
    stop = s;
	}

	public void printTable( )
	{

   for (int k = 1;k <= stop; k++)
   {
   System.out.println(k + "         " + number * k);
   } 
   
   
   
   
	}
}