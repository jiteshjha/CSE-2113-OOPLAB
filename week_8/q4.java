import java.util.Scanner;

interface Series {
	int getNext();
	void reset();
	void setStart();
}

class ByTwos implements Series {
	int arr[];
	int index = 0;
	int maxSize;
	public int getNext() {
		return (arr[index++] + 2);
	}
	public void reset() {
		index = -1;
	}
	public void setStart() {
		Scanner in = new Scanner(System.in);
		int value;
		System.out.println("Enter the value from which the series should start:");
		value = in.nextInt();
		System.out.println("Enter the size of the series");
		maxSize = in.nextInt();
		arr = new int[maxSize];
		arr[0] = value;
	}
}

class q4 {
	public static void main(String[] args) {
		ByTwos s = new ByTwos();
		Series ref;
		ref = s;
		ref.setStart();
		for(int i = 1; i < s.maxSize; i++) 
			s.arr[i] = ref.getNext();
		System.out.printf("Series:\n");
		for(int i = 0; i < s.maxSize; i++) 
			System.out.printf("%d\t", s.arr[i]);
		System.out.printf("\n");
	}
}
	
