import java.util.Scanner;

class BankAccount {
	String name;
	long accountNo;
	char accountType;
	double amount;
	static double interest;
	BankAccount() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name :");
		name = in.nextLine();
		System.out.println("Enter Account Number :");
		accountNo = in.nextLong();
		System.out.println("Enter Account Type : (Saving = s or S, Current = c or C) ");
		accountType = in.next().charAt(0);
		System.out.println("Enter Balance amount :");
		amount = in.nextDouble();
		System.out.println("Enter rate of interest :");
		interest = in.nextDouble();
	}
	BankAccount(String name, long accountNo, char accountType, double amount, double interest) {
		this.name = new String(name);
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.amount = amount;
		this.interest = interest;
	}
	BankAccount(BankAccount a) {
		name = new String(a.name);
		accountNo = a.accountNo;
		accountType = a.accountType;
		amount = a.amount;
		interest = a.interest;
	}
	
	void deposit() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount to be deposited :");
		amount = in.nextDouble();
	}
	
	void withdraw() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount for withdrawal");
		double am = in.nextDouble();
		if(am < amount) {
			amount -= am;
			System.out.println("Rs. " + am + " withdrawed.");
			System.out.println("Current balance : " + amount);
		}
		else {
			System.out.println("Insufficient balance!");
		}
	}
	void display() {
		System.out.println("\nDetails:");
		Scanner in = new Scanner(System.in);
		System.out.println("Name :" + name);
	
		System.out.println("Account Number :" + accountNo);
		System.out.print("Account Type : ");
		if(accountType == 'S' || accountType == 's')
			System.out.println("Current account.");
		else if(accountType == 'C' || accountType == 'c')
			System.out.println("Savings account.");
		else
			System.out.println("Invalid account type!");
		System.out.println("Balance amount : " + amount);	
	}
	public static void rateOfInterest() {
		System.out.println("Rate of interest : " + interest + "%");	
	}
}

class q4 {
	public static void main(String[] args) {
		System.out.println("Calling default constructor");
		BankAccount user1 = new BankAccount();
		user1.display();
		
		System.out.println("\nCalling parameterized constructor");
		BankAccount user2 = new BankAccount("Jitesh", 12345, 's', 12.0, 12.5);
		user2.display();

		System.out.println("\nCalling copy constructor");
		BankAccount user3 = new BankAccount(user2);
		user3.display();

		System.out.println("\nPerforming operations");
		user1.deposit();
		user1.withdraw();
		user1.display();
		
		BankAccount.rateOfInterest();
	}
}
	
		
		
