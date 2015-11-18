import myPackages.p1.Max;
import java.util.Scanner;
class q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Max m = new Max();
		System.out.println("Enter three integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println("Maximum: " + m.max(a, b, c));
		System.out.println("Enter three floating-point numbers: ");
		float x = in.nextFloat();
		float y = in.nextFloat();
		float z = in.nextFloat();
		System.out.println("Maximum: " + m.max(x, y, z));
		System.out.println("Enter the size of 1D array: ");
		int size = in.nextInt();
		System.out.println("Enter the elements: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++)
			arr[i] = in.nextInt();
		System.out.println("Maximum: " + m.max(arr));
		System.out.println("Enter the row and column for 2D array: ");
		int row = in.nextInt();
		int col = in.nextInt();
		System.out.println("Enter the elements: ");
		int[][] arr1 = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr1[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Maximum: " + m.max(arr1, row, col));
	}
}
