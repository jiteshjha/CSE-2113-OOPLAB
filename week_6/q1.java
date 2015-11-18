import java.util.Scanner;
import java.util.GregorianCalendar;

class Person {
	private String name;
	private GregorianCalendar birthDate;
	Person() {
		name = "";
		birthDate = new GregorianCalendar();
	}
	Person(String name, GregorianCalendar birthDate) {
		this.name = new String(name);
		this.birthDate = birthDate;
	}
	public String accessName() {
		return name;
	}
	public GregorianCalendar accessDate() {
		return birthDate;
	}
}

class CollegeGraduate extends Person {			
		private float GPA;
		private int yearOfGrad;
		CollegeGraduate() {
			super();
			GPA = 0.0f;
			yearOfGrad = 0000;
		}
		CollegeGraduate(float GPA, int yearOfGrad, String name, GregorianCalendar birthDate) {
			super(name, birthDate);
			this.GPA = GPA;
			this.yearOfGrad = yearOfGrad;
		}
		public float accessGPA() {
			return GPA;
		}
		public long accessYear() {
			return yearOfGrad;
		}
	}

public class q1 {
	public static void main(String[] args) {
		String name;
		GregorianCalendar date;
		int day, year, month, yearOfGrad;
		float GPA;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name:\n> ");
		name = in.nextLine();
		System.out.print("\nEnter birth date(dd mm yy):\n> ");
		day = in.nextInt();
		month = in.nextInt();
		year = in.nextInt();
		System.out.print("\nEnter GPA:\n> ");
		GPA = in.nextFloat();
		System.out.print("\nEnter year of graduation:\n> ");
		yearOfGrad = in.nextInt();
		
		date = new GregorianCalendar(year, month, day);
		CollegeGraduate c = new CollegeGraduate(GPA, yearOfGrad, name, date);
		
		System.out.println("\nDetails: ");
		System.out.println("Name: " + c.accessName());
		date = c.accessDate();
		System.out.println("Birth date: " + date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + date.get(GregorianCalendar.MONTH) + "/" 
		+ date.get(GregorianCalendar.YEAR));
		System.out.println("GPA: " + c.accessGPA());
		System.out.println("Year of Graduation: " + c.accessYear());
		
	}
}
	
