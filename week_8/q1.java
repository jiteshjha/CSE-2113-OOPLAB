import java.util.Scanner;

interface Stack {
	void push(int param);
	void pop();
}

class FixedStack implements Stack {
	private int maxSize;
	private int[] stackArray;
	private int tos;
	public void initial(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		tos = -1;
	}
	public void push(int i) {
		if(tos == maxSize-1)
			System.out.println("Stack overflow!");
		else
			stackArray[++tos] = i;
	}
	public void pop() {
		if(tos == -1)
			System.out.println("Stack underflow!");
		else
			tos--;
	}
	public void display() {
		int i = 0;
		for(i = 0; i <= tos; i++)
			System.out.print(stackArray[i] + " ");
		System.out.println();
	}
}

class DynamicStack implements Stack {
	private int maxSize;
	private int[] stackArray;
	private int tos;
	public void initial() {
		maxSize = 2;
		stackArray = new int[maxSize];
		tos = -1;
	}
	public void isFull() {
		int newArr[] = new int[this.maxSize*2];
		for(int i = 0; i < this.maxSize; i++) 
			newArr[i] = this.stackArray[i];
		this.stackArray = newArr;
		this.maxSize *= 2;
	}
	public void push(int i) {
		if(tos == maxSize-1)
			isFull();
		else
			stackArray[++tos] = i;
	}
	public void pop() {
		if(tos == -1)
			System.out.println("Stack underflow!");
		else
			tos--;
	}
	public void display() {
		int i = 0;
		for(i = 0; i <= tos; i++)
			System.out.print(stackArray[i] + " ");
		System.out.println();
	}
}

public class q1 {
	public static void main(String[] args) {
		int size, item;
		int choice;
		FixedStack s = new FixedStack();
		DynamicStack d = new DynamicStack();
		Stack ref;
		Scanner in = new Scanner(System.in);
		ref = s;

		System.out.print("Enter the size for fixed stack\n>");
		size = in.nextInt();
		
		s.initial(size);
		
		for(;;) {
			System.out.println("Press 1 for Push, 2 for pop\n3 for display, 4 to exit");
			choice = in.nextInt();
			if(choice == 1) {
				System.out.println("Enter element");
				item = in.nextInt();
				ref.push(item);
				continue;
			}
			if(choice == 2) {
				ref.pop();
				continue;
			}
			if(choice == 3) {
				s.display();
				continue;
			}
			else
				break;
		}
		System.out.println("Dynamic stack!");
		d.initial();
		ref = d;
		for(;;) {
			System.out.println("Press 1 for Push, 2 for pop\n3 for display, 4 to exit");
			choice = in.nextInt();
			if(choice == 1) {
				System.out.println("Enter element");
				item = in.nextInt();
				ref.push(item);
				continue;
			}
			if(choice == 2) {
				ref.pop();
				continue;
			}
			if(choice == 3) {
				d.display();
				continue;
			}
			else
				break;
		}
	}
}
		
	
	
