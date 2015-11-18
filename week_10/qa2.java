import java.util.Scanner;
	
class Print<T> {
	private T arr[];
	private int size;	
	Print(T[] arr) {
		this.size = arr.length;
		this.arr = arr;
	}

	public void display() {
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + "\t");
	}
}
class qa2 {
	public static void main(String[] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size\n>");
		int n = in.nextInt();
		
		Integer arr[] = new Integer[n];
		System.out.print("Enter the array elements\n>");

	
		for(int i = 0; i < n; i++)
			arr[i] = in.nextInt();

		Print<Integer> obj = new Print<Integer>(arr);
		System.out.print("Result:\n");
		obj.display();
		System.out.println();
	}
}
