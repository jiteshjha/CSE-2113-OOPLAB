import java.util.GregorianCalendar;
import java.util.Scanner;

class Student {
	int regNo;
	String fullName;
	GregorianCalendar date;
	short semester;
	float GPA;
	float CGPA;
	public static int count = 0;
	Student() {
		count++;
		fullName = new String("");
		date = new GregorianCalendar();
		semester = 0;
		GPA = 0.0f;
		CGPA = 0.0f;

		int year = date.get(GregorianCalendar.YEAR);
		regNo = year % 10 * 100;
		year /= 10;
		regNo += year % 10 * 1000;
		regNo += count; 
			
	}
	Student(String fullName, GregorianCalendar date, short semester, float GPA, float CGPA) {
		count++;
		this.fullName = new String(fullName);
		this.semester = semester;
		this.GPA = GPA;
		this.CGPA = CGPA;
		this.date = date;

		int year = date.get(GregorianCalendar.YEAR);
		regNo = year % 10 * 100;
		year /= 10;
		regNo += year % 10 * 1000;
		regNo += count; 
	}
	Student(Student s) {
		regNo = s.regNo;
		fullName = new String(s.fullName);
		semester = s.semester;
		GPA = s.GPA;
		CGPA = s.CGPA;
		date = s.date;
	}
	void display() {
		System.out.println("Details : ");
		System.out.println("Registration Number : " + regNo);
		System.out.println("Full name : " + fullName);
		System.out.println("Date of joining :" + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + date.get(GregorianCalendar.MONTH) + "/" 
		+ date.get(GregorianCalendar.YEAR));	
		System.out.println("Semester : " + semester);
		System.out.println("GPA : " + GPA);
		System.out.println("CGPA : " + CGPA);
	}
	void changeName() {
		String[] abc = fullName.split(" ");
		fullName = "";
		for(int i = 0; i < abc.length - 1; i++) {
			fullName += abc[i].charAt(0);
			fullName +=".";
		}
		fullName +=" ";
		fullName += abc[abc.length - 1];
	}
	static void sortSem(Student[] s) {
		Student stemp = new Student();
		for(int i = 0; i < 5; i++) {
            	int index = i;
            		for (int j = i + 1; j < 5; j++)
                		if (s[j].semester < s[index].semester)
                   		 	index = j;
      
            		stemp = s[index]; 
            		s[index] = s[i];
            		s[i] = stemp;
       	 	}
	}
	static void sortCgpa(Student[] s) {
		Student stemp = new Student();
		for(int i = 0; i < 5; i++) {
            	int index = i;
            		for (int j = i + 1; j < 5; j++)
                		if (s[j].CGPA < s[index].CGPA)
                   		 	index = j;
      
            		stemp = s[index]; 
            		s[index] = s[i];
            		s[i] = stemp;
       	 	}
	}
	static void sortName(Student[] s) {
		Student stemp = new Student();
		for(int i = 0; i < 5; i++) {
            	int index = i;
            		for (int j = i + 1; j < 5; j++)
                		if (((s[j].fullName).compareTo(s[index].fullName)) < 0)
                   		 	index = j;
      
            		stemp = s[index]; 
            		s[index] = s[i];
            		s[i] = stemp;
       	 	}
	}
	static void listChar(Student[] s) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the character to find names starting with that character");
		char c = in.next().charAt(0);
		System.out.println("Required students :");
		for(int i = 0; i < 5; i++) {
			if(s[i].fullName.charAt(0) == c) {
				s[i].display();
			}
		}
	}
	static void listSubstring(Student[] s) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter substring to search names :");
		String sub = in.nextLine();
		System.out.println("Required student names :");
		for(int i = 0; i < 5; i++) {
			if(s[i].fullName.toLowerCase().contains(sub.toLowerCase())) {
				System.out.println(s[i].fullName);
			}
		}
	}
		
}

class q1 {
	public static void main(String[] args) {
		Student []s = new Student[5];
	
		int day, month, year;
		short sem;
		String fullname;
		float gpa, cgpa;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter details of 5 students :");
		for(int i = 0; i < 5; i++) {
			System.out.println("Student " + (i+1) + " :");
			System.out.println("Enter Full name : ");
			fullname = in.next();
			System.out.println("Enter  Date of joining (dd/mm/yy) :");
			day = in.nextInt();
			month = in.nextInt();
			year = in.nextInt();
			System.out.println("Enter Semester : ");
			sem = in.nextShort();
			System.out.println("Enter GPA : ");
			gpa = in.nextFloat();
			System.out.println("Enter CGPA : ");
			cgpa = in.nextFloat();
			GregorianCalendar d =  new GregorianCalendar(year, month, day);
			s[i] = new Student(fullname, d, sem, gpa, cgpa);
		}
		System.out.println("Sorting student records with respect to semester");
		Student.sortSem(s);
		System.out.println("Sorted records :");
		for(int i = 0; i < 5; i++) 
			s[i].display();

		System.out.println("Sorting student records with respect to CGPA");
		Student.sortCgpa(s);
		System.out.println("Sorted records :");
		for(int i = 0; i < 5; i++) 
			s[i].display();

		System.out.println("Sorting student records with respect to name");
		Student.sortName(s);
		System.out.println("Sorted records :");
		for(int i = 0; i < 5; i++) 
			s[i].display();
		Student.listChar(s);
		Student.listSubstring(s);
		System.out.println("Changing student names :");
		for(int i = 0; i < 5; i++)
			s[i].changeName();
		System.out.println("Altered names :");
		for(int i = 0; i < 5; i++) 
			System.out.println(s[i].fullName);
		
		
	}
}
