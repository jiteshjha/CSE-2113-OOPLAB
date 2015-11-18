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

public class School extends Building {
	int classNo;
	String grade;
	public void Input() {
		super.Input();		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of classrooms:\n> ");
		classNo = in.nextInt();
		System.out.print("Enter grade level:\n> ");
		grade = in.next();
	}
	public void Display() {
		super.Display();
		System.out.println("Number of classrooms: " + classNo);
		System.out.println("Grade level: " + grade);
	}
}
