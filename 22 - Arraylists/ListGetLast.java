//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 2/12/2021

import java.util.List;
import java.util.ArrayList;

public class ListGetLast
{
	//method go will return a list
	//containing the all of the values greater 
	//than the last value in the list
	public static List<Integer> go(  List<Integer> ray )
	{ 
     ArrayList yes = new ArrayList();
    for(int x = 0; x < ray.size() - 1; x++)
    {
    if(ray.get(x) > ray.get(ray.size() - 1))
    {
    yes.add(ray.get(x));
    } 
    }
		return yes;
	}
}