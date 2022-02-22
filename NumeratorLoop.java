// Numerator/2 + numerator/4 + numerator/6...

import java.util.Scanner;

class NumeratorLoop {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter the numerator ");
		int n = Sc.nextInt();
		System.out.println(" Enter number of iterations ");
		int f = Sc.nextInt();
		double d = 2;
		double sum = 0;
		double div = 0;
		System.out.print(" The series is : ");
		for (int i = 1; i <= f; i++) {
			div = (n / d);
			sum = sum + div;
			d += 2;
			System.out.print(div + " ");
		}
	}
}