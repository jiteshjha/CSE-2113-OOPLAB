import java.util.Scanner;
import java.util.InputMismatchException;
class Employee {
	String name;
	Integer age;
	Double grossSalary;
	Float takeHomeSalary;
	Character grade;
	
	void Input() {
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter name:");
			name = in.nextLine();
			System.out.println("Enter age:");
			age = in.nextInt();
			System.out.println("Enter gross salary:");
			grossSalary = in.nextDouble();
			System.out.println("Enter take home salary:");
			takeHomeSalary = in.nextFloat();
			System.out.println("Enter grade:");
			grade = in.next().charAt(0);
		}
		catch(InputMismatchException e) {
			System.out.println("Incorrect Input!");
			System.exit(0);
		}
	}
	void Display() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Gross salary:" + grossSalary);
		System.out.println("Take home salary:" + takeHomeSalary);
		System.out.println("Grade:" + grade);
	}
	
}

class q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Employee employee = new Employee();
		int choice;
		while(true) {
			System.out.print("Press 1 for input, 2 for Display, 3 for exit:\n>");
			choice = in.nextInt();
			if(choice == 1) {
				employee.Input();
				continue;
			}
			if(choice == 2)
				employee.Display();
			else
				System.exit(0);
		}
	}
}

