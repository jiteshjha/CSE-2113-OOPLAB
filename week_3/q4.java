class Stack {
	private int maxSize;
	private int[] stackArray;
	private int tos;
	public void initial(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		tos = -1;
	}
	public void push(int i) {
		if(tos >= maxSize)
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

class q4 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.initial(10);
		s.push(10);
      		s.push(20);
      		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.pop();
		s.display();
	}
}

