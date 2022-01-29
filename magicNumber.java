// Magic number is a number which eventually reaches 1 after iteratively replacing it with the sum of its digits
// Ex - 199 => 1 + 9 + 9 = 19 => 1 + 9 = 10 => 1 + 0 = 1
// Hence 199 is a magic number and it took 3 steps to reach 1

import java.util.Scanner;

public class magicNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum = 0, digit = 0, counter = 0;
		do {
			sum = 0;
			while (num > 0) {
				digit = num % 10;
				sum += digit;
				num /= 10;
			}
			num = sum;
			counter += 1;
		} while (num > 9);

		if (num == 1)
			System.out.println("It is a magic number and it reached 1 in " + counter + " iterations");
		else
			System.out.println("It is not a magic number");
	}
}
