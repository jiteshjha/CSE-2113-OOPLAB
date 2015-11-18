import java.util.Scanner;
 
public class q6
{
  public static void main(String args[])
  	{
		
		int size,arr1[][],arr2[][],sum[][];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimension");
		size = in.nextInt();
		arr1 = new int[size][size];
		arr2 = new int[size][size];
		sum = new int[size][size];
		System.out.print("Enter elements for array 1\n");
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				arr1[i][j] = in.nextInt();

			}
			System.out.println();
		}
		System.out.print("Enter elements for array 2\n");
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				arr2[i][j] = in.nextInt();

			}
			System.out.println();
		}
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];

			}
			System.out.println();
		}
		System.out.print("The sum is :\n");
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				System.out.print(sum[i][j]+"\t");

			}
			System.out.println();
		}
	}
}
		
	
		
