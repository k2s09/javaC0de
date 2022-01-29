// Program to swap the values of two variables using third variable

import java.util.Scanner;

class Swap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println(" The first number is " + a);
		System.out.println(" The second number is " + b);
	}
}