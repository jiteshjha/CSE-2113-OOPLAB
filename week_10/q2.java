import java.util.Scanner;

class Node<T> {
	T data;
	Node<T> next;

	public Node(T value, Node<T> next) {
		this.data = value;
		this.next = next;
	}

	public T value() {
		return data;
	}

	public Node<T> nextNode() {
		return next;
	}

	public void setValue(T value) {
		this.data = value;
	}

	public void setNext (Node<T> next) {
	    this.next = next;
	}
}

class List<T> {
	Node<T> head = null;
	
	public void addEnd(T value) {
		if(head == null)
			head = new Node<T>(value, null);
		else {
			Node<T> p = head;
			while(p.next != null)
				p = p.next;
			Node<T> temp = new Node<T>(value, null);
			p.next = temp;
		}
	}

	public void addBegin(T value) {
		if(head == null)
			head = new Node<T>(value, null);
		else {
			Node<T> temp = new Node<T>(value, null);
			temp.setNext(head);
			head = temp;
			
		}
	}

	public T pop() {
		if(head == null)
			return null;
		T item = head.value();
		head = head.nextNode();
		return item;
	} 

	public void display() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.print(temp.value() + "\t");
			temp = temp.next;
		}		
	}
		
}

public class q2 {
	static void print(Object string) {
		System.out.print(string);
	}

	public static void main(String ... args) {
		Scanner in = new Scanner(System.in);
		int size, choice, item;
		Integer i;
		Double d;
		double itemD;
		List <Integer> listI = new List <Integer>();
		List<Double> listD = new List<Double>();

		print("Integer stack\n");
		for(;;) {
			print("Press 1 for addStart, 2 for addEnd,\n 3 for delete, 4 to display, 5 to exit\n>");
			choice = in.nextInt();
			if(choice == 1) {
				print("Enter item:\n>");
				item = in.nextInt(); 	
				listI.addBegin(item);
			}
			else if(choice == 2) {
				print("Enter item:\n>");
				item = in.nextInt(); 	
				listI.addEnd(item);
			}
			else if(choice == 3) {
				i = listI.pop();
				if(i != null) 
					print(i + " popped\n");
				else
					print("Stack underflow!\n");
			}
			else if(choice == 4) {
				listI.display();
				print("\n");
			}
			else
				break;
		}
		print("Double type stack\n");
		for(;;) {
			print("Press 1 for addStart, 2 for addEnd,\n 3 for delete, 4 to display, 5 to exit\n>");
			choice = in.nextInt();
			if(choice == 1) {
				print("Enter item:\n>");
				itemD = in.nextInt(); 	
				listD.addBegin(itemD);
			}
			else if(choice == 2) {
				print("Enter item:\n>");
				itemD = in.nextInt(); 	
				listD.addEnd(itemD);
			}
			else if(choice == 3) {
				d = listD.pop();
				if(d != null) 
					print(d + " popped\n");
				else
					print("Stack underflow!\n");
			}
			else if(choice == 4) {
				listD.display();
				print("\n");
			}
			else
				break;
		}
	}
}
		

	
		
	
	
