// Seperating the digits of a number and adding them

import java.util.Scanner;

class Seperation {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter your three digit number ");
		int n = Sc.nextInt();
		int a = 0;
		int sum = 0;
		int c = 1;
		do {
			a = (n % 10);
			sum = sum + a;
			n /= 10;
			c++;
		} while (c <= 3);
		System.out.println(" The sum is " + sum);
	}
}
            