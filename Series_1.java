// 1/1! + 1/2! + 1/3! ...

import java.util.Scanner;

class Series_1 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number of iterations");
		int n = Sc.nextInt();
		int numerator = 1, denominator = 1, fact = 1;
		double sum;
		for (int i = 1; i <= n; i++) {
			sum = numerator / denominator;
			System.out.print(sum + "  ");
			denominator++;
			for (int j = 1; j <= denominator; j++) {
				fact = fact * j;
			}
			denominator = fact;
		}
	}
}
