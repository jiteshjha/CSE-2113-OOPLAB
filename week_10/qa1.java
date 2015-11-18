import java.util.Scanner;

class Exchange<T> {

	private T arr[];
	private int size;	
	
	Exchange(T[] arr) {
		this.size = arr.length;
		this.arr = arr;
	}
	
	public void display() {
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + "\t");
	}
	
	public void change(int pos1, int pos2) {
		T temp;
		temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}

public class qa1 {
	public static void main(String[] arg) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size\n>");
		int n = in.nextInt();
		
		Integer arr[] = new Integer[n];
		System.out.print("Enter the array elements\n>");

	
		for(int i = 0; i < n; i++)
			arr[i] = in.nextInt();
		
	 	Exchange<Integer> obj = new Exchange<Integer>(arr);
		System.out.print("Enter the positions to be exchanged\n>");
		int p = in.nextInt();
		int q = in.nextInt();
		
		obj.change((p-1),(q-1));
		System.out.print("Result:\n");
		obj.display();
		System.out.println();
	}
}
