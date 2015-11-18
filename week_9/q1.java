class Calc{
	static synchronized void calculate(int num) throws InterruptedException {
		for(int i = 1; i <= 10; i++) 
				System.out.println(num + " * " + i + " = " + (num * i));
		
	}
}

class MulThread extends Thread {
	int num;
	MulThread(int num) {
		super("MulFiveThread");
		this.num = num;
		start();
	}
	
	public void run() {
		try {
			Calc.calculate(num);
		}
		catch(InterruptedException e) {
			System.out.println("MulThread interrupted");
		}
	}
}	

public class q1 {
	public static void main(String ... args) {
		new MulThread(5);
		new MulThread(7);
		
	}
}
		
