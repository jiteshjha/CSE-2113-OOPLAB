import java.util.Scanner;
import java.util.*;
class UniqueThread implements Runnable {
	Thread t;
	int arr[][];
	int row, col;
	boolean check = true;
	int unique;
	UniqueThread(int arr[][], int row, int col) {
		t = new Thread(this);
		this.arr = arr;
		this.row = row;
		this.col = col;	
		t.start();
	}
	public void run() {
		try {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					unique = arr[i][j];
					for(int k = 0; k < row; k++) {
						for(int h = 0; h < col; h++) {
							if(unique == arr[k][h]) {
								check = false;
								break;
							}
						}
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("UniqueThread interrupted");
		}
	}
}	

class RowThread implements Runnable {
	Thread t;
	int arr[][];
	int rowSum[];
	int col, row;
	RowThread(int arr[][], int col, int row) {
		t = new Thread(this);
		this.arr = arr;
		t.start();
		this.col = col;
		this.row = row;
		rowSum = new int[row];
	}
	public void run() {
		try {
			for(int i = 0; i < row; i++) {
				rowSum[i] = 0;
				for(int j = 0; j < col; j++) {
					rowSum[i] += arr[i][j];
					
				}
			}
		}
		catch(Exception e) {
			System.out.println("SumThread interrupted");
		}
	}
}

class ColThread implements Runnable {
	Thread t;
	int arr[][];
	int colSum[];
	int col, row;
	ColThread(int arr[][], int col, int row) {
		t = new Thread(this);
		this.arr = arr;
		t.start();
		this.col = col;
		this.row = row;
		colSum = new int[col];
	}
	public void run() {
		try {
			for(int j = 0; j < col; j++) {
				colSum[j] = 0;
				for(int i = 0; i < row; i++) {
					colSum[j] += arr[i][j];
					
				}
			}
		}
		catch(Exception e) {
			System.out.println("SumThread interrupted");
		}
	}
}

class MainDiagonalThread implements Runnable {
	Thread t;
	int arr[][];
	int mainDiag = 0;
	int col, row;
	MainDiagonalThread(int arr[][], int col, int row) {
		t = new Thread(this);
		this.arr = arr;
		t.start();
		this.col = col;
		this.row = row;
	}
	public void run() {
		try {
			for(int i = 0; i < row; i++) 
				mainDiag += arr[i][i];
			
		}
		
		catch(Exception e) {
			System.out.println("SumThread interrupted");
		}
	}
}

class SecondDiagonalThread implements Runnable {
	Thread t;
	int arr[][];
	int secondDiag = 0;
	int col, row;
	SecondDiagonalThread(int arr[][], int col, int row) {
		t = new Thread(this);
		this.arr = arr;
		t.start();
		this.col = col;
		this.row = row;
	}
	public void run() {
		try {
			for(int i = 0; i < row; i++) 
				secondDiag += arr[i][row - i - 1];
			
			}
			
		catch(Exception e) {
			System.out.println("SecondDiagonalThread interrupted");
		}
	}
}

public class qa1 {
	static void print(Object string) {
		System.out.print(string);
	}
	public static void main(String ... args) {
		Scanner in = new Scanner(System.in);	
		int arr[][];
		int row, col;
		boolean unique = true;
		
		print("Enter the row and column for the matrix:\n>");
		row = in.nextInt();
		print(">");
		col = in.nextInt();
		
		arr = new int[row][col];
		
		print("\nEnter the matrix:\n");
		for(int i = 0; i < row; i++) 
			for(int j = 0; j < col; j++) 
				arr[i][j] = in.nextInt();
		UniqueThread thread1 = new UniqueThread(arr, row, col);
		RowThread thread2 = new RowThread(arr, row, col);
		ColThread thread3 = new ColThread(arr, row, col);
		MainDiagonalThread thread4 = new MainDiagonalThread(arr, row, col);
		SecondDiagonalThread thread5 = new SecondDiagonalThread(arr, row, col);
		
		for(int i = 1; i < row; i++) {
			if(thread2.rowSum[i-1] != thread2.rowSum[i])
				unique = false;
		}
		for(int i = 1; i < col; i++) {
			if(thread3.colSum[i-1] != thread3.colSum[i])
				unique = false;
		}
		if(thread4.mainDiag != thread5.secondDiag) {
			unique = false;
			print("\nMain" + thread4.mainDiag);
			print("\nMain" + thread4.mainDiag);
		}
		
		
		if(unique == true)
			print("\nMagic Square!\n");
		else
			print("\nNot a Magic Square!\n");
		
			
		
			
	}
}

	
