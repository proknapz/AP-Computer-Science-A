//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class TriangleFive
{
	public static String go( int amount, char letter )
	{
String output="";

	for (int i=0;i<amount;i++) {

		char c=letter;

		for (int j=0;j<amount-i;j++) {
			for (int k=j;k<amount;k++) {
				output += c;
			}
			output += ' ';
			if (c == 'Z') c = 'A';
			else c++;
		}
		output += '\n';
      }
	return output+"\n";
     
	}
}