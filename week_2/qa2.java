import java.util.Scanner;
 
public class qa2
{
  public static void main(String args[])
  	{
		int size;
		int[] arr;
		boolean check;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size\n");
		size = in.nextInt();
		arr = new int[size];
		System.out.print("Enter elements\n");
		for(int i = 0; i < size; i++)
			arr[i] = in.nextInt();
		System.out.print("Prime numbers: ");
		for(int num : arr) {
			if(num < 2) continue;
			if(num == 2) System.out.print(num + " ");
			check = true;
			for(int i=2; i<=size/2; i++) {
				if(num%i == 0)
					{ check = false; break; }

			}
			if(check == true) System.out.print(num + " ");

		}
		System.out.println();
	}
}
