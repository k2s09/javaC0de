// If a number is not divisible by either 2, 3 or 5

import java.util.Scanner;

public class Ugly_no {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		long n = sc.nextInt();
		while (n != 1) {
			if (n % 2 == 0)
				n /= 2;
			else if (n % 3 == 0)
				n /= 3;
			else if (n % 5 == 0)
				n /= 5;
			else
				break;
		}
		if (n == 1)
			System.out.println("It is an ugly number");
		else
			System.out.println("It is not a ugly number ");
	}
}