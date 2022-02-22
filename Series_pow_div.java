// Prints sum of series => 1 - ((x^2)/2!) + ((x^4)/4!) - ((x^6)/6!) .. so on

import java.util.Scanner;

class Series_pow_div {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms");
		int A = sc.nextInt();
		System.out.println("Enter value of x");
		int x = sc.nextInt();
		double sum = 1;
		int fact = 1, den = 2;
		for (int i = 1; i <= A; i++) {

			for (int c = 1; c <= den; c++) {
				fact *= c;
			}
			sum -= Math.pow(x, den) / fact;
			x = -x;
			den += 2;
		}
		System.out.println("The sum is " + sum);
	}
}
