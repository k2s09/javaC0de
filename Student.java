// Using default constructor and functions to make a student chart

import java.util.Scanner;

class Student {
	String name;
	int id, marks;

	Student() {
		name = " ";
		id = 0;
		marks = 0;
	}

	public static void main(String args[]) {
		Student S1 = new Student();
		S1.input();
		Student S2 = new Student();
		S2.input();
	}

	void input() {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		name = Sc.next();
		System.out.print("Enter your i.d. : ");
		id = Sc.nextInt();
		System.out.print("Enter your marks (Out of 820) : ");
		marks = Sc.nextInt();
		double per = (marks * 100);
		double percent = per / 820;
		System.out.println("Name\tI.D.\tMarks\tPercent");
		System.out.println(name + "\t" + id + "\t" + marks + "\t" + percent);
	}
}
/**
 * Variable Data Table
 * Varible  Data type  Function
 * name     String     To store name
 * id       int        To store student id
 * marks    int        To store marks
 * percent  double     To store percentage
 */
        