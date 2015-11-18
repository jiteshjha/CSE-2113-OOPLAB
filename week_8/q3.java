import java.util.Scanner;
import java.util.GregorianCalendar;
class SeatsFilledException extends Exception {
	SeatsFilledException() {
		System.out.println("Seats full!");
      		
   }
}
class Student {
	String name;
	int regNo;
	static int count = 0;
	Student() {
		count++;
	}
	void registration() throws SeatsFilledException {
		int check;
		GregorianCalendar date = new GregorianCalendar();
		int year = date.get(GregorianCalendar.YEAR);
		regNo = year % 10 * 100;
		check = year % 10 * 100;
		
		year /= 10;
		regNo += year % 10 * 1000;
		check += year % 10 * 1000;
		check += 25;
		regNo += count;
		if(regNo > check) 
			throw new SeatsFilledException();
	}
		
	void Input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name:\n>");
		name = in.nextLine();
		try {
		registration();
		}
		catch(SeatsFilledException e) {
			System.out.println(e);
		}
	}
	void display() {
		System.out.println("Registration Number : " + regNo);
		System.out.println("Full name : " + name);
	}
}

class q3 {
	public static void main(String ... args) {
		Scanner in = new Scanner(System.in);
		int size;
		System.out.print("Enter the number of Students:\n>");
		size = in.nextInt();
		Student s[] = new Student[size];
		for(int i = 0; i < size; i++) {
			System.out.println("Student "+(i+1)+" :");
			s[i] = new Student();
			s[i].Input();
		}
		System.out.println("Details : ");
		for(int i = 0; i < size; i++) {
			s[i].display();
		}
		
	}
}
		
