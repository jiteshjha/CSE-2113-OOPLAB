import java.util.Scanner;

abstract class Figure {
	abstract void area();
	int x, y;
}

class Rectangle extends Figure {
	void area() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimension for Rectangle(length, breadth):");
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Area of Rectangle: " + x*y + " sq. units");
	}
}

class Triangle extends Figure {
	void area() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimension for Triangle(base, height):");
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Area of Triangle: " + ((x*y)/(float)2) + " sq. units");
	}
}

class Square extends Figure {
	void area() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the dimension for Square(side):");
		x = in.nextInt();
		System.out.println("Area of Square: " + x*x + " sq. units");
	}
}

public class q4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Square s = new Square();
		Figure f;
		f = r;
		f.area();
		f = t;
		f.area();
		f = s;
		f.area();
	}
}
