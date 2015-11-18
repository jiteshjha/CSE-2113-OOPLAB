import java.util.Scanner;
import java.util.GregorianCalendar;

class Patient {
	String name;
	short age;
	long hospitalNo;
	public void Input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name:\n> ");
		name = in.nextLine();
		System.out.print("Enter age:\n> ");
		age = in.nextShort();
		System.out.print("Enter hospital number:\n> ");
		hospitalNo = in.nextShort();
	}
	public void Display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Hospital Number: " + hospitalNo);
	}
}

class Inpatient extends Patient {
	String departName;
	GregorianCalendar admitDate;
	String roomType;
	public void Input() {
		super.Input();
		int day, month, year;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter department name:\n> ");
		departName = in.nextLine();
		System.out.print("Enter admit date(dd mm yy):\n> ");
		day = in.nextInt();
		month = in.nextInt();
		year = in.nextInt();
		admitDate = new GregorianCalendar(year, month, day);
		System.out.print("Enter room type:\n> ");
		roomType = in.next();
	}
	public void Display() {
		super.Display();
		System.out.println("Department Name: " + name);
		System.out.println("Date of joining: " + admitDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + admitDate.get	   			(GregorianCalendar.MONTH) + "/" + admitDate.get(GregorianCalendar.YEAR));
		System.out.println("Room type: " + roomType);
	}
}
class Billing extends Inpatient {
	GregorianCalendar dischargeDate;
	public void Input() {
		super.Input();
		int day, month, year;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter discharge date(dd mm yy):\n> ");
		day = in.nextInt();
		month = in.nextInt();
		year = in.nextInt();
		dischargeDate = new GregorianCalendar(year, month, day);
	}
	public void Display() {
		super.Display();
		System.out.println("Date of discharge: " + dischargeDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + dischargeDate.get	   			(GregorianCalendar.MONTH) + "/" + dischargeDate.get(GregorianCalendar.YEAR));
	}
}

public class q2 {
	public static void main(String[] args) {
		int factorC = 0, factorR = 0, consult, rent;
		Billing bill = new Billing();
		bill.Input();

		System.out.println("\n---Details---");
		bill.Display();
		if("special".equals(bill.roomType.toLowerCase())) {
			factorC = 1000;
			factorR = 200;
		}
		else if("semispecial".equals(bill.roomType.toLowerCase())) {
			factorC = 500;
			factorR = 100;
		}
		else if("general".equals(bill.roomType.toLowerCase())) {
			factorC = 100;
			factorR = 50;
		}
		else
			System.out.println("Invalid room type");
		consult = (bill.dischargeDate.get(GregorianCalendar.DAY_OF_MONTH) - bill.admitDate.get(GregorianCalendar.DAY_OF_MONTH)) * 			factorC;
		rent = (bill.dischargeDate.get(GregorianCalendar.DAY_OF_MONTH) - bill.admitDate.get(GregorianCalendar.DAY_OF_MONTH)) * factorR;
		System.out.println("Consultancy charges: Rs." + consult);
		System.out.println("Room charges: Rs." + rent);
		System.out.println("Total: Rs. " + (consult + rent));
	}
}
