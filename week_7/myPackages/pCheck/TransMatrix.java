package myPackages.pCheck;
import myPackages.pTrans.Trans;
import java.util.Scanner;
 
class TransMatrix
{
   public static void main(String args[])
   {
      int m, n, c, d;
      Trans t=new Trans();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int matrix[][] = new int[m][n];
 
      System.out.println("Enter the elements of matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            matrix[c][d] = in.nextInt();
 
      System.out.println("Transpose of entered matrix:-");
      System.out.print("\n");
      t.TransMat(matrix[][],m,n);
      }
   }

