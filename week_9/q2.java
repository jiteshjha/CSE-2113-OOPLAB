import java.util.Scanner;
import java.util.*;
class SumThread implements Runnable {
	Thread t;
	int row[];
	int sum;
	SumThread(int row[]) {
		t = new Thread(this);
		this.row = row;
		t.start();
	}
	public void run() {
		try {
			for(int i = 0; i < row.length; i++) 
				sum += row[i];
		}
		catch(Exception e) {
			System.out.println("SumThread interrupted");
		}
	}
}

public class q2 {
	static void print(Object string) {
		System.out.print(string);
	}
	public static void main(String ... args) {
		int row, col, size;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		print("Enter the rows and columns for the matrix:\n>");
		row = in.nextInt();
		print(">");
		col = in.nextInt();
		int matrix[][] = new int[row][col];
		print("\nEnter the matrix:\n");
		for(int i = 0; i < row; i++) 
			for(int j = 0; j < col; j++) 
				matrix[i][j] = in.nextInt();
		SumThread s[] = new SumThread[row];
		for(int i = 0; i < row; i++) 
			s[i] = new SumThread(matrix[i]);
		for(int i = 0; i < row; i++) 
			print("\nRow sum " + (i+1) + " : " + s[i].sum);
		print("\n");
		try {
			for(int i = 0; i < row; i++) 
				sum += s[i].sum;
		}
		catch(Exception e) {
			print("MainThread interrupted");
		}
		print("\nComplete sum : " + sum);
		print("\n");
			
	}
}

