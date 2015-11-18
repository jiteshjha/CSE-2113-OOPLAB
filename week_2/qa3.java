import java.util.Scanner;
public class qa3
{
    public static void main(String args[])throws Exception
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int size=in.nextInt();
        int arr[][]=new int[size][size];
         
        System.out.print("Enter the elements : \n");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                
                arr[i][j]=in.nextInt();
            }
        }
 
        
        
        System.out.println("The Matrix is : ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        
         
        boolean check = true;
         
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                
                if(arr[i][j]!=0) 
                {
                    check = false;
                    break;
                }
            }
        }
         
        if(check == true)
            System.out.println("The matrix is Lower Triangular!");
        else
            System.out.println("The matrix is not Lower Triangular!");
    }
}
