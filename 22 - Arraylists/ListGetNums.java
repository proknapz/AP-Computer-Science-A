//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 2/12/2021
import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
      ArrayList yes = new ArrayList();
      int y = 0;
      
      for(int x = 0; x < ray.size();x++)
      {
      if(ray.get(x) > 11)
      {
      yes.add(ray.get(x));  
      y++;
      if(y == 3)
         return yes;
      
          
      }
      
      }
		return yes;
	}
}