//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar  Khan

import static java.lang.System.*;

public class LetterRemover
{
	public static String removeLetters( String sentence, char rem )
	{
	
      String cleaned = sentence;
		int loc = sentence.indexOf(rem);
		while (loc > 0) {
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(rem);

		}

		return cleaned;



   
   }
}