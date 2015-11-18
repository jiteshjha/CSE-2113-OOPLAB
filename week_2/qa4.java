import java.util.Scanner;
 
public class qa4
{
  public static void main(String args[])
  	{
		
		int size,arr[][],trace = 0;
		double norm = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter dimension");
		size = in.nextInt();
		arr = new int[size][size];
		System.out.print("Enter elements\n");
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				arr[i][j] = in.nextInt();

			}
			System.out.println();
		}
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if(i == j) { 
					trace = trace + arr[i][j];
					norm = norm + (arr[i][j]*arr[i][j]);
				}

			}
		}
		norm = Math.sqrt(norm);
		System.out.printf("The norm is: %.2f\n ",norm);
		System.out.println("The trace is: "+trace);
	}
}
