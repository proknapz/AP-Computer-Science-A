//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

public class LetterOrVowelRunner
{
	public static void main( String args[] )
	{
		LetterOrVowel s = new LetterOrVowel();		
		System.out.println( s.check(  "apluscompsci")  );
		//add more test cases		
      System.out.println( s.check(  "1forthemoney")  );
      System.out.println( s.check(  "chicken99")  );
      System.out.println( s.check(  "funkycoldsnow")  );
      System.out.println( s.check(  "APLUSCOMPSCI")  );
      System.out.println( s.check(  "77sodacans99")  );
      System.out.println( s.check(  "aardvark")  );
      System.out.println( s.check(  "cancancancan")  );

	}
}