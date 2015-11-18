package myPackages.p1;

import java.util.Scanner;

public class Max {
	public int max(int num1, int num2, int num3) {
		return (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
	}
	public float max(float num1, float num2, float num3) {
		return (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
	}
	public int max(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}
	public int max(int arr[][], int row, int col) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(arr[i][j] > largest)
					largest = arr[i][j];
			}
		}
		return largest;
	}
}
		
