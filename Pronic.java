// Checking whether number input by user is heteromecic or Pronic

import java.util.Scanner;

class Pronic {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = Sc.nextInt();
		int c1 = 1;
		int c2 = (c1 + 1);
		// A pronic number is always an odd number
		if (n % 2 != 0) {
			System.out.println(" The number is a pronic number ");
			System.out.print(" The two numbers that make " + n + " are : " + (n / 2) + " and " + ((n / 2) + 1));
		} else {
			System.out.println(" Number is a heteromecic number ");
		}
	}
}
