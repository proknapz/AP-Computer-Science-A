import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum(  )
    {
    int sum = 0;
		for(int row = 0; row < m.length; row++)
      {
         for(int column = 0; column < m[row].length; column++)
         {
         sum+=m[row][column]; 
         }
      }
    return sum;
    }
}