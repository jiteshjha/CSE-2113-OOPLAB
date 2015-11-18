import java.util.Scanner;

class q3 {
	public static void main(String[] args)
	{
		int size, insert, pos;
		int[] arr;
		int [] insArr;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size(MAX 11)\n");
		size = in.nextInt();
		arr = new int[11];
		System.out.print("Enter elements\n");
		for(int i = 0; i < size; i++)
			arr[i] = in.nextInt();
		System.out.print("Enter element to be inserted and position\n");
		insert = in.nextInt();
		pos = in.nextInt();
		for(int i = size; i >= pos; i--)
			arr[i] = arr[i-1];
		arr[pos-1] = insert;
		size++;
		System.out.print("New array :\n");
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nEnter location where you wish the element to be deleted");
		pos = in.nextInt();
		if ( pos >= size+1 )
		      System.out.print("Deletion not possible.\n");
		   else
		   {
		      for (int c = pos - 1 ; c < size - 1 ; c++ )
			 arr[c] = arr[c+1];
		 	
		      System.out.println("Resultant array is\n");
		 
		     for(int i = 0; i < size-1; i++)
			 System.out.print(arr[i] + " ");
		   }
		
		
	}
}
