// program to find area and perimetre of objects with given dimensions

import java.util.Scanner;

class Formulae {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Make sure they are in same unit");
		System.out.println(" Enter length of rectangle ");
		double a1 = Sc.nextDouble();
		System.out.println(" Enter breadth of rectangle ");
		double a2 = Sc.nextDouble();
		System.out.println(" Enter radius of circle ");
		double a3 = Sc.nextDouble();
		double area1 = (a1 * a2);
		double area2 = (22 / 7 * a3 * a3);
		double perimetre1 = 2 * (a1 + a2);
		double circumference1 = 2 * 22 / 7 * a3;
		System.out.println(" The area of rectangle is " + area1);
		System.out.println(" The perimetre of rectangle is " + perimetre1);
		System.out.println(" The area of circle is " + area2);
		System.out.println(" The circumference of circle is " + circumference1);
	}
}
        