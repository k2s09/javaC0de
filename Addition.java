// Program to add two numbers

import java.util.Scanner;

class Addition {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter first number");
		int a = Sc.nextInt();
		System.out.println(" Enter second number ");
		int b = Sc.nextInt();
		int c = a + b;
		System.out.println(" The answer is " + c);
	}
}
