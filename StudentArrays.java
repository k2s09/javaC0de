// Using arrays to make a report card for 5 students

import java.util.Scanner;

class StudentArrays {
	// Declaring the arrays
	static int eng[] = new int[5];
	static int mat[] = new int[5];
	static int scs[] = new int[5];
	static double sum[] = new double[5];
	static double per[] = new double[5];
	static String name[] = new String[5];

	public static void main(String args[]) {
		Scanner S = new Scanner(System.in);
		System.out.println("How many students: ");
		int n = S.nextInt();
		// Taking input using all the arrays
		for (int i = 0; i < n; i++) {
			System.out.println("Welcome student");
			System.out.println("Enter name : ");
			name[i] = S.next();
			// Marks to be entered out of 80
			System.out.println("Enter marks of english : ");
			eng[i] = S.nextInt();
			System.out.println("Enter marks of maths : ");
			mat[i] = S.nextInt();
			System.out.println("Enter marks of sciences : ");
			scs[i] = S.nextInt();
			sum[i] = (eng[i] + mat[i] + scs[i]);
			per[i] = ((sum[i] / 240) * 100);
		}
		S.close();
		StudentArrays obj = new StudentArrays();
		obj.print();
	}

	void print() {
		System.out.println("\n");
		// Printing all the values
		System.out.println("Name" + "\t" + "English" + "\t" + "Maths" + "\t" + "Science" + "\t" + "Total" + "\t" + "Percentage");
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + scs[i] + "\t" + sum[i] + "\t" + per[i] + "%");
		}
	}
}
/**
 * Variable Name   Data Type   Function
 * eng []          int         To store marks of students in english
 * mat []          int         To store marks of students in maths
 * scs []          int         To store marks of students in sciences
 * name []         String      To store name of students
 * sum []          double      To store total marks of students
 * per []          double      To store the percentage of students
 */

