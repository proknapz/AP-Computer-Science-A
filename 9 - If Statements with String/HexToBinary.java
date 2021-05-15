//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class HexToBinary
{
	public static String getBinary( char hex )
	{
      switch (hex)
      {
      case 'A': return "1010"; 
      case 'B': return "1011"; 
      case 'C': return "1100"; 
      case 'D': return "1101"; 
      case 'E': return "1110"; 
      case 'F': return "1111"; 
      default : return "ERROR";
      
      }
		
	}
}