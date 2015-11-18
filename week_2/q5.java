import java.util.Scanner;
 
public class q5
{
  public static void main(String args[])
  	{
		
		int size,arr[][];
		boolean symm = true;
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
				if(arr[i][j] != arr[j][i])
					{
						symm = false;
						break;
					}
			}
			if(symm == false) break;
			
		}
		if(symm == true) System.out.println("Matrix is symmetric!");
		else System.out.println("Matrix is not symmetric!");
	}
}
