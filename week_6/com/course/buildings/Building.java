package com.course.buildings;
import java.util.Scanner;

public class Building {
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




