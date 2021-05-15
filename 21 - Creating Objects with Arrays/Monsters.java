//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monsters[] myMonsters;
   

   
	public Monsters(int size)
	{
   myMonsters = new Monsters[size];
	}

	public void add(int spot, Monsters m)
	{
  		Monsters[] m1 = new Monsters[spot];

        //put m in the Monster array at [spot]
	}

	public Monsters getLargest( )
	{
		return null;
	}

	public Monsters getSmallest( )
	{
		return null;
	}

	public String toString()
	{
		return myMonsters+"";
	}
}