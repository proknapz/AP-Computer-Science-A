//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Omar Khan

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble m = new BiggestDouble();
      
      System.out.println("4.5 6.7 7.8 9.0 \nbiggest = " + m.getBiggest(4.5, 6.7, 7.8, 9.0));
      System.out.println("\n14.51 6.17 71.8 1.0 \nbiggest = " + m.getBiggest(14.51, 6.17, 71.8, 1.0));
      System.out.println("\n41.15 816.7 17.8 19.0 \nbiggest = " + m.getBiggest(41.15, 816.7, 17.8, 19.0));
      System.out.println("\n884.5 16.7 7.8 9.0 \nbiggest = " + m.getBiggest(884.5, 16.7, 7.8, 9.0));
      System.out.println("\n4.5 -456.7 677.8 9.0 \nbiggest = " + m.getBiggest(4.5, -456.7, 677.8, 9.0));
      System.out.println("\n4.5 16.7 -7.8 -9.0 \nbiggest = " + m.getBiggest(4.5, 16.7, -7.8, -9.0));		
	}
}