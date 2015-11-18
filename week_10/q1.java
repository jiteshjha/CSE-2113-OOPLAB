import java.util.Scanner;

class Student {
	String name;
	int id;
	
	Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
}

class Employee {
	String name;
	int id;

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}


class ArrayStack <Item> {
	private Item[] container ;
	private int top;
	private static int DEFAULT_SIZE = 10;

	public ArrayStack() {
		this(DEFAULT_SIZE);
	}
	
	public ArrayStack(int size) {
		container =  (Item[])new Object[size];
		
		top = -1;
		DEFAULT_SIZE = size;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public Item pop() {
		if(top == -1)
			return null;
		Item item = container[top];
		container[top--] = null;
		return item;
	}

	public void push(Item item) {
		if(top == DEFAULT_SIZE - 1)
			System.out.printf("\nStack full!\n");
		else {
			container[++top] = item;
		}
	}
}

public class q1 {
	static void print(Object string) {
		System.out.print(string);
	}

	public static void main(String ... args) {
		
		Student s;
		Employee e;
		int size, id, choice;
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of Student stack\n");
		size = in.nextInt();
		ArrayStack <Student> stackS = new ArrayStack <Student>(size);

		for(;;) {
			print("Press 1 for Push, 2 for pop, 3 to exit\n>");
			choice = in.nextInt();
			if(choice == 1) {
				in.nextLine();
				print("Enter name:\n>");
				name = in.next();
				print("Enter id:\n>");
				id = in.nextInt(); 
				s = new Student(name, id);	
				stackS.push(s);
			}
			else if(choice == 2) {
				s = stackS.pop();
				if(s != null) 
					print("Student " + s.name + " popped\n");
				else
					print("Stack underflow!\n");
			}
			else
				break;
		}

		System.out.println("Enter the size of Employee stack\n");
		size = in.nextInt();
		ArrayStack <Employee> stackE = new ArrayStack <Employee>(size);

		for(;;) {
			print("Press 1 for Push, 2 for pop, 3 to exit\n>");
			choice = in.nextInt();
			if(choice == 1) {
				in.nextLine();
				print("Enter name:\n>");
				name = in.next();
				print("Enter id:\n>");
				id = in.nextInt(); 
				e = new Employee(name, id);	
				stackE.push(e);
			}
			else if(choice == 2) {
				e = stackE.pop();
				if(e != null) 
					print("Employee " + e.name + " popped\n");
				else
					print("Stack underflow!\n");
			}
			else
				break;
		}
	}
}			
		

		
