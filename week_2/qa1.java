import java.util.Scanner;
 
public class qa1
{
  public static void main(String args[])
  	{
		int size, high1, high2, low1, low2;
		int[] arr;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter size\n");
		size = in.nextInt();
		arr = new int[size];
		System.out.print("Enter elements\n");
		for(int i = 0; i < size; i++)
			arr[i] = in.nextInt();
		high1 = Integer.MIN_VALUE;
		high2 = Integer.MIN_VALUE;	
		for(int num: arr) {
			if(num > high1) {
				high2 = high1;
				high1 = num;
			}
			else if(num > high2) { 
				high2 = num;
			}
		}
		low1 = Integer.MAX_VALUE;
		low2 = Integer.MAX_VALUE;
		System.out.println("Second largest:"+high2);
		for(int num: arr) {
			if(num < low1) {
				low2 = low1;
				low1 = num;
			}
			else if(num < low2) { 
				low2 = num;
			}
		}
		System.out.println("Second smallest:"+low2);

	}
}

