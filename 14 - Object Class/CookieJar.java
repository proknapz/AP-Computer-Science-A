//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan

//design your CookieJar class
//write all code for your CookieJar class here
//test your CookieJar class with the CookieJarRunner

class CookieJar
{
 private int one;
 

 
 public CookieJar(int n1)
 {
 one = n1;
 }
 
 public int addStuff(int a)
 {
 one -= a;
 
 return one * -1;
 }
 
 public int spaceLeft()
 {
 if (one > 0)
   return one; 
 return 0;
 }
 
 
 
 public boolean isFull()
 {
 return (one < 0);
 }











}


