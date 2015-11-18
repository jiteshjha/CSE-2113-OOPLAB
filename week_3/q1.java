class Complex {
	int re, im;
	void initial(int r, int i)
	{
		re = r;
		im = i;
	}
	public void display() {
		System.out.print(re + " + " + im + "i" + "\n");
	}
	public Complex add(Complex a) {
		Complex c1 = new Complex();
		c1.re = re + a.re;
		c1.im = im + a.im;
		return c1;
	}
	public Complex subtract(Complex a) {
		Complex c2 = new Complex();
		c2.re = re - a.re;
		c2.im = im - a.im;
		return c2;
	}
}


class q1 {
	public static void main(String[] args) {
		int re1, im1, re2, im2;
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.initial(1,2);
		c2.initial(3,4);
		c1 = c1.add(c2); //Addition
		c1.display();
		c1.initial(3,4);
		c2.initial(1,1);
		c1 = c1.subtract(c2); // Subtraction
		c1.display();
		}
}
	
