// 153 = 1^3 + 5^3 + 3^3, 153 is an armstrong number

import java.util.Scanner;

class Armstrong_Number {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number greater than zero");
		double n = Sc.nextInt();
		double nd = n;
		double nnd = n;
		double sum = 0;
		int c = 0;
		while (n > 0) {
			n /= 10;
			c++;
		}
		for (int i = 1; i <= c; i++) {
			double f = (nd % 10);
			f = (Math.pow(f, 3));
			sum = sum + f;
			nd /= 10;
		}
		if (sum == nnd) {
			System.out.println("The number is an armstrong number");
		} else {
			System.out.println("The number is not an armstrong number ");
		}
		Sc.close();
	}
}
        