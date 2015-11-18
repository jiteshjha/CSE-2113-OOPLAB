
package myPackages.pTrans;

public class Trans{
 public static void TransMat(int matrix[][],int m,int n){
 int c,d,count=0;
 int transpose[][] = new int[n][m];
 for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )               
            transpose[d][c] = matrix[c][d];
      }

 for ( c = 0 ; c < n ; c++ )
      {
         for ( d = 0 ; d < m ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }


 for( c=0;c<m;c++)
    {
       for(d=0;d<n;d++)
         {
           if(transpose[c][d]==matrix[c][d])
              {
               count++;
              }
         }
    }

 if(count==(m*n))
 {
     System.out.println("it is a symmetric matrix");
 }
 else
     System.out.println("it is not a symmetric matrix");
}
}
