//Prints sum of series1/1!+1/2!+1/3!..........

import java.util.Scanner;

public class Series_div {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms");
		int A = sc.nextInt();
		double sum = 0;
		int fact = 1;
		for (int i = 1; i <= A; i++) {
			for (int c = 1; c <= i; c++) {
				fact *= c;
			}
			sum += 1.0 / fact;
		}
		System.out.println("The sum is " + sum);
	}
}
