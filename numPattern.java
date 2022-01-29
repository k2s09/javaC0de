// Making a number pattern

import java.util.Scanner;

class numPattern {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number of iterations");
		int n = Sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int k = 1; k <= n; k++) {
			for (int l = 1; l <= k; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

	}
}
/**
 * Variable Data Table
 * Variable    Data Type   Function
 * n           int         To store number of iterations
 * i,j,l,k     int         Used to make said pattern
 */