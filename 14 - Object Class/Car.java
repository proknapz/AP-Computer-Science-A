//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

//design your Car class
//write all code for your Car class here
//test your Car class with the CarRunner

class Car
{

   private int one;
   private int two;
   
   public Car(int n1, int n2)
   {
   one = n1;
   two = n2; 
   }
   
   public void addMiles(int two)
   {
   one+=2000;
   }
   
   public boolean timeForOilChange()
   {
   
   if (one > two)
   {
   if (one == 9000)
   one = 0;
   return true;
   }else{
   return false;
   }
   
   }
















}