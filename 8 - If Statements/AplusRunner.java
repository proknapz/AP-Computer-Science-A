//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class AplusRunner
{
	public static void main( String args[] )
	{
      AB NumChecker = new AB();
		//test cases - client code
	   //	System.out.println( NumChecker.checks() );
		//add more cases
		
		System.out.println( NumChecker.check( "chicken", "a", "b" ) );
		//add more cases
		System.out.println( NumChecker.check( "frog", "f", "g" ) );
		System.out.println( NumChecker.check( "chicken", "c", "k" ) );
		System.out.println( NumChecker.check( "apluscompsci", "a", "s" ) );      
		System.out.println( NumChecker.check( "apluscompsci", "a", "p" ) );      
		System.out.println( NumChecker.check( "apluscompsci", "s", "c" ) );      
		System.out.println( NumChecker.check( "apluscompsci", "c", "p" ) );      
      
		
	}
}