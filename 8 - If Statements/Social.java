//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;


   public Social()
   {

   }


    public void setWord(String s)
    {
        socialNum = s;
    }

    public void chopAndAdd()
    {
        int w = socialNum.lastIndexOf("-");
        int e = socialNum.indexOf("-");
        
        
        
        if( w !=  e)
        {
        String t = socialNum.substring(0,(socialNum.indexOf("-")));
        String y = socialNum.substring(socialNum.indexOf("-") + 1, socialNum.lastIndexOf("-"));
        String u = socialNum.substring(socialNum.lastIndexOf("-") + 1);
        sum =  Integer.parseInt(t) + Integer.parseInt(y) + Integer.parseInt(u);
        }else{
        sum = -1;
        }
        
        
    }
    
    
    
    public String toString()
    {
        return "SS# " + socialNum + " has a total of " + sum;
    }
}