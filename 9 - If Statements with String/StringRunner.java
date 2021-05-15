//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;
public class StringRunner
{
	public static void main(String args[])
	{
   
   BiggestString pls = new BiggestString();
   System.out.println( pls.getBiggest( "abc", "cba", "bca" ));   
   System.out.println( pls.getBiggest( "one", "fourteen", "twenty" ));  
   System.out.println( pls.getBiggest( "124323", "20009", "3434" ));  
   System.out.println( pls.getBiggest( "abcde", "ABCDE", "1234234324" ));  
      



	}
}