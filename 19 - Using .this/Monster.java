//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

//design your Monster class
//write all code for your Monster class here
//test your Monster class with the MonsterRunner

//Construct PIV name and size

public class Monster
{
   private String name;
   private int size;
   
   
   public Monster(String n, int s)
   {
   name = n;
   size = s;
   }
   

   public Monster()
   {
   this("No name",0);
   }
   
   public Monster(String name)
   {
   this(name,0);
   }
   
   public Monster(int size)
   {
   this("No name", size);
   }
   
   public void setName(String name)
   {
   this.name = name;
   }
   
   public void setSize(int size)
   {
   this.size = size;  
   }
   
   
   public int getSize()
   {
   return size;
   }
   
   public String getName()
   {
   return name;
   }
   
   
   public boolean isBigger(Monster other)
   {
   return this.size > other.getSize();
   }
   
   public boolean isSmaller(Monster other)
   {
   return this.size < other.getSize();
   }
   
   public boolean namesTheSame(Monster other)
   {
   return name.equals(other.getName());
   }
   
   public String toString()
   {
   return name + " " + size ;
   }
   
   

   
}

