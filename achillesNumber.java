/**
 * An Achilles Number is a number that is powerful but not a perfect power.
 * A Powerful Number is a positive integer N, such that for every prime factor p of N, p2 is also a factor.
 * A Perfect Power is a positive integer N such that it can be expressed as ab, where a and b are natural numbers > 1.
 */

import java.util.Scanner;

public class achillesNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		boolean b1 = isPowerful(num);
		boolean b2 = isPerfect(num);
		if (b1 && b2 == false)
			System.out.println("Number is an achilles number");
		else
			System.out.println("Number is not an achilles number");
	}

	public static boolean isPowerful(int num) {
		int flag1 = 0, flag2 = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag1 += 1;
				if (num % (i * i) != 0) {
					flag2 += 1;
				}
			}
		}
		if (flag1 == flag2)
			return true;
		else
			return false;
	}

	public static boolean isPerfect(int num) {
		for (int i = 2; i < num; i++) {
			for (int j = 2; j < num; j++) {
				int exponent = (int) (Math.pow(i, j));
				if (exponent == num)
					return true;
			}
		}
		return false;
	}
}
