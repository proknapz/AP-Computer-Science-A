//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khans

public class Discount
{
	private double amount;
	
	public Discount( double a )
	{
   amount = a;
	}
	
	public boolean check()
	{  
   boolean t = true;
   boolean f = false;
   if (amount <= 2000.00)
		return t;
      
      return f;
	}
	
	public double getTheBill()
	{  
      if (amount >= 2000.00)
      {
      double o = amount * 0.85;
		return o;
      }
      return amount;
	}
}