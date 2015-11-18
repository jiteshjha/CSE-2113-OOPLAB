class Time {
	int hour = 0, min = 0, sec = 0;
	public void initial(int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}
	
	public void display() {
		System.out.println(hour + ":" + min + ":" + sec);
	}
	
	public Time add(Time t1) {
		Time t = new Time();
		
		
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
		Time t = new Time();
		
		
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
		Time t1 = new Time();
		Time t2 = new Time(); 
		
		t1.initial(5,2,3);
		t2.initial(2,59,59);
		t1.display();
		t1 = t1.add(t2);
		t1.display();
		if(t2.hour > t1.hour) { //if t2 is greater than t1
		
			System.out.println("Subtraction operation not possible\n"); //t2 must be smaller than t1 for subtraction
			System.exit(0);
		}
		t1 = t1.subtract(t2);
		t1.display();
		t2.display();
		t1.compare(t2); //t1 is first, t2 is second
	}
}
	
