// program to grade a student based on percentage which is derived from marks entered by user

import java.util.Scanner;

class Grading {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter marks of 5 subjects ");
		double a = Sc.nextDouble();
		double b = Sc.nextDouble();
		double c = Sc.nextDouble();
		double d = Sc.nextDouble();
		double e = Sc.nextDouble();
		double total = (a + b + c + d + e);
		double per = total / 500 * 100;
		System.out.println(" The total is " + total);
		System.out.println(" The percentage is " + per + "%");
		if (per >= 60)
			System.out.println(" You have attained first division ");
		if (per >= 50 && per <= 59)
			System.out.println(" You have attained second division ");
		if (per >= 40 && per <= 49)
			System.out.println(" You have attained third division ");
		if (per < 40)
			System.out.println(" You have failed ");
	}
}
