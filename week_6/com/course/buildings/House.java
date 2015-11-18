package com.course.buildings;
import java.util.Scanner;

class Building {
	float sqFeet;
	short stories;
	public void Input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter square footage:\n> ");
		sqFeet = in.nextFloat();
		System.out.print("Enter no. of stories:\n> ");
		stories = in.nextShort();
	}
	public void Display() {
		System.out.println("Square footage: " + sqFeet);
		System.out.println("Stories: " + stories);
	}
}

public class House extends Building {
	short bedNo, bathNo;
	public void Input() {
		super.Input();		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of beds:\n> ");
		bedNo = in.nextShort();
		System.out.print("Enter number of bath:\n> ");
		bathNo = in.nextShort();
	}
	public void Display() {
		super.Display();
		System.out.println("Number of beds: " + bedNo);
		System.out.println("Number of baths: " + bathNo);
	}
}
