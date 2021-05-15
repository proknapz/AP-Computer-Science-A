//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class Quadratic
{
	public  double getRootOne( int a, int b, int c )
	{

		return (-1 * b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
	
	public  double getRootTwo( int a, int b, int c )
	{
		return (-1 * b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
}