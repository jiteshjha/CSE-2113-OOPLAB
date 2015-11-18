import java.util.Scanner;

class q1 {
	public static void main(String[] args)
	{
		int size;
		int[] arr;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size\n");
		size = in.nextInt();
		arr = new int[size];
		System.out.print("Enter elements\n");
		for(int i = 0; i < size; i++)
			arr[i] = in.nextInt();
		int[] newArr = new int[size];		
		for(int i = 0, j=size-1; i < size; i++,j--)
		{
			newArr[j] = arr[i];
		}
		System.out.print("\nThe array is:\n");
		for(int i = 0; i < size; i++)
			System.out.print(newArr[i]+" ");
				
	}
}
