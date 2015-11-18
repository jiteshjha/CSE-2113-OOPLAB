import java.util.Scanner;

class Counter {
	public static int count = 0;
	Counter() {
		count++;
	}
	
	public static void showCount() {
		System.out.println(count + " objects have been created.");
	}
}

class q5 {
	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of objects :");
		size = in.nextInt();
		
		Counter count[] = new Counter[size];
		for(int i = 0; i < size; i++) {
			count[i] = new Counter();
		}
		
		Counter.showCount();
	}
}
