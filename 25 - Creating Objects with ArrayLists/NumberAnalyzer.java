//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.util.ArrayList;
import java.util.Scanner;



import static java.lang.System.*;
public class NumberAnalyzer
{
	private ArrayList<Number> list;
	//write a constructor
   public NumberAnalyzer(int[] nums)
   {
   list = new ArrayList<Number>();
   }
   public NumberAnalyzer()
	{
		
	}
	//write count odds
   public int countOdds()
   {
   //Number yo = new Number();
int oddCount=0;
	for(int i = 0; i<list.size(); i++){
		if(Number.isOdd())
			oddCount++;
	}


    return oddCount;
   }
   
   
	//write count evens
   public int countEvens()
   {
    int evenCount=0;
    for(int i = 0; i<list.size(); i++){
		if(Number.isOdd() == false)
			evenCount++;
         }

    return evenCount;
   }
	//write count perfects
	public int countPerfects()
   {
   return 0; 
   }
   
  	//write a toString
   public String toString( )
	{
		return list.toString();
	}
}