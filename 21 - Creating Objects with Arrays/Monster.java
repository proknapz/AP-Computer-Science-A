//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster
{  
   //build your own Monster class 
	//with methods like isBigger and isSmaller
	//or use your Monster class from
	//lab18 lab set 1
   

   
   private int weight;
   private int height;
   private int age;
   private int size;
   
   public Monster(int s)
   {
   size = s;
   }
   
   public Monster(int w, int h, int a)
   {
   weight = w;
   height = h;
   age = a;
   }
   
   public void setWeight(int weight)
   {
   this.weight = weight;
   }
   
   public void setHeight(int height)
   {
   this.height = height;  
   }
   
   public void setAge(int age)
   {
   this.age = age;  
   }
   
   public int getWeight()
   {
   return weight;
   }
   
   public int getHeight()
   {
   return height;
   }
   
   public int getAge()
   {
   return age;
   }
   
   public int isBigger(Monster other)
   {
   return 0;
   }
   
   public int isSmaller(Monster other)
   {
   return 0;
   }
   
   public String toString()
   {
   return "";
   }

   
}