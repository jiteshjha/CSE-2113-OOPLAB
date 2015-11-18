import java.util.Scanner;

class Time {
	int hour, min , sec ;
	Time() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter hour, min and sec");
		hour = in.nextInt();
		min = in.nextInt();
		sec = in.nextInt();		
	}
	Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	Time(Time t) {
		hour = t.hour;
		min = t.min;
		sec = t.sec;
	}
	
	public void display() {
		System.out.print(hour + ":" + min + ":" + sec);
	}
	
	public Time add(Time t1) {
		Time t = new Time(0, 0, 0);
		
		
		t.sec = sec + t1.sec;
		if(t.sec > 59) {
			t.sec = t.sec - 60;
			min++;
		}
		t.min = min + t1.min;
		if(t.min > 59) {
			t.min = t.min - 60;
			hour++;
		}
		t.hour = hour + t1.hour;
		return t;
	}
	public Time subtract(Time t1) {
		Time t = new Time(0, 0, 0);
		
		
		t.sec = sec - t1.sec;
		if(t.sec < 0) {
			t.sec = t.sec + 60;
			min--;
		}
		t.min = min - t1.min;
		if(t.min < 0) {
			t. min = t.min + 60;
			hour--;
		}
		t.hour = hour - t1.hour;
		return t;
	}
	public void compare(Time t1) {
		if(t1.hour < hour)
			System.out.println("First is greater than the second!");
		else if(t1.hour > hour)
			System.out.println("First is smaller than the second!");
		else if(t1.hour == hour)
			System.out.println("Times are equal!");
		else if(t1.min < min)
			System.out.println("First is greater than the second!");
		else if(t1.min > min)
			System.out.println("First is smaller than the second!");
		else if(t1.min == min)
			System.out.println("Times are equal!");
		else if(t1.sec < sec)
			System.out.println("First is greater than the second!");
		else if(t1.sec > sec)
			System.out.println("First is smaller than the second!");
		else
			System.out.println("Times are equal!");
		
	}
}

class q2 {
	public static void main(String[] args) {
		//calling default cosntructor
		Time t1 = new Time();
		Time t2 = new Time(); 
		
		//calling paramterized constructor
		Time t3 = new Time(2, 3, 4);
		t3.display();

		//calling copy constructor
		Time t4 = new Time(t3);
		t4.display();

		System.out.print("\nAdding ");
		t1.display();
		System.out.print(" & ");
		t2.display();
		System.out.print("\nAnswer: ");
		t1 = t1.add(t2);
		t1.display();

		System.out.print("\nSubtracting ");
		t1.display();
		System.out.print(" & ");
		t2.display();


		if(t2.hour > t1.hour) { //if t2 is greater than t1
		
			System.out.println("Subtraction operation not possible\n"); //t2 must be smaller than t1 for subtraction
			System.exit(0);
		}
		t1 = t1.subtract(t2);
		System.out.print("\nAnswer: ");
		t1.display();

		System.out.print("\nComparing ");
		t1.display();
		System.out.print(" & ");
		t2.display();
		System.out.print("\nAnswer: ");
		t1.compare(t2); //t1 is first, t2 is second
	}
}
	
