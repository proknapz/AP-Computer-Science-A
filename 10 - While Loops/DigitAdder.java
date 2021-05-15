//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

public class DigitAdder
{
	public static int go( int num )
	{
   

int sum = 0;


while (num != 0)
{
sum = sum + num % 10;
num/=10;


}
return sum;
   
         
    

	}
}