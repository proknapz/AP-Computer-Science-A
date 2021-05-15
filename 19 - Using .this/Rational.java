//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

//design your Rational class
//write all code for your Rational class here
//test your Rational class with the RationalRunner

public class Rational
{
      private int num1;
      private int den1;
      private int frac;

      public Rational(int n1, int d1)
      {
      num1 = n1;
      den1 = d1;
      }

     
      public Rational(int den1)
      {
      this(0,den1);
      }

      public void setRational(int num1,int den1)
      {
      this.num1 = num1;
      this.den1 = den1;
      }
      
        

      
      public int getNum()
      {
      return num1;
      }
      
      public int getDen()
      {
      return den1;
      }
      


            
      public String add(Rational other)
      {
      int a = (this.num1 * other.getDen() + other.getNum() * this.den1);
      int b = (other.getDen() * this.den1);
      int c = a;
      int d = b;
     
      
      while(d!= 0) {
      if(c > d)
         c = c - d;
      else
         d = d - c;        
      }
      a/=c;
      b/=c;
      
      return a + "/" + b;
      }
      
      public boolean isBigger(Rational other)
      {
      int e = this.num1 * other.getDen();
      int g = other.getNum() * this.den1;
      return (e > g);
      }
      
      public String toString()
      {
      return num1 + "/" + den1;
      }
      


       


}