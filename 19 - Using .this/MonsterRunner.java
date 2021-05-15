//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);


System.out.print("Enter 1st monster's name : ");
String name = keyboard.next();
System.out.print("Enter 1st monster's size : ");	
int size = keyboard.nextInt();	
	
Monster mOne = new Monster(name, size);



System.out.print("Enter 2nd monster's name : ");
name = keyboard.next();
System.out.print("Enter 2nd monster's size : ");	
size = keyboard.nextInt();	
	
Monster mTwo = new Monster(name, size);	

System.out.println("\nMonster 1 - " + mOne.getName() + " " + mOne.getSize());
System.out.println("Monster 2 - " + mTwo.getName() + " " + mTwo.getSize());



if(mOne.isBigger(mTwo)==true)
{
	System.out.println("\nMonster one is bigger than Monster two.");
}
if(mOne.isSmaller(mTwo)==true)
{
	System.out.println("\nMonster one is smaller than Monster two.");
}

if(mOne.namesTheSame(mTwo)==true)
{
	System.out.println("Monster one has the same name as Monster two.");
}
else
{
   System.out.println("Monster one does not have the same name as Monster two.");
}

	}
}