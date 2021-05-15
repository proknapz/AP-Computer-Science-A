//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class MoreMoreAplus
{
	/*
		Return "a" if the string does not contain an occurence of "aplus" and has an odd length.  
		Return "plus" if the string has at least 1 occurence of "aplus" and the length is even.  
		Return "comp" if an "aplus" if found starting at position 0 and at the end of the string.  
		Return "sci" in all other situations.	
	*/
   public static String go( String a )
	{
		int pos = a.indexOf( "aplus" );					
		if( pos == -1 && a.length()%2!=0 )
			   return "a";
		if( pos > -1 && a.length()%2==0 )
			   return "plus";
		if( pos == 0 && a.lastIndexOf( "aplus") == a.length()-"aplus".length() )
			   return "comp";			
		return "sci";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
no
no
yes
no
yes
no
no
yes
no



*/