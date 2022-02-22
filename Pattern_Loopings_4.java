import java.util.Scanner;

class Pattern_Loopings_4 {
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