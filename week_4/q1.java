import java.util.Scanner;

class Complex {
	int re, im;
	Complex()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter real and imaginary value");
		re = in.nextInt();
		im = in.nextInt();
	}
	Complex(int re, int im) {
		this.re = re;
		this.im = im;
	}
	Complex(Complex c) {
		re = c.re;
		im = c.im;
	}
	public void display() {
		System.out.print(re + " + " + im + "i");
	}
	public Complex add(Complex a) {
		Complex c1 = new Complex(0, 0);
		c1.re = re + a.re;
		c1.im = im + a.im;
		return c1;
	}
	public Complex subtract(Complex a) {
		Complex c2 = new Complex(0, 0);
		c2.re = re - a.re;
		c2.im = im - a.im;
		return c2;
	}
}


class q1 {
	public static void main(String[] args) {
		int re1, im1, re2, im2;
		
		System.out.println("Calling default constructor");
		Complex c = new Complex(); //calling default constructor
		c.display();
		
		System.out.println("\nCalling parameterized constructor");
		Complex c1 = new Complex(1, 2); // calling parameterized constructor
		Complex c2 = new Complex(3, 4);// calling parameterized constructor
		c1.display();
		System.out.println();
		c2.display();
		
		System.out.println("\nCalling copy constructor");
		Complex c3 = new Complex(c1); //
		c3.display();
		
		System.out.print("\nAdding ");
		c1.display();
		System.out.print(" & ");
		c2.display();
		System.out.print("\nAnswer: ");
		c1 = c1.add(c2); //Addition
		c1.display();
	
		System.out.print("\nSubtracting ");
		c1.display();
		System.out.print(" & ");
		c2.display();
		c1 = c1.subtract(c2); // Subtraction
		System.out.print("\nAnswer: ");
		c1.display();
		System.out.println();
		}
}
	
