import java.util.Scanner;

class concentric {
	public static void main(String args[]) {
		int n = new Scanner(System.in).nextInt();
		n = 2 * n - 1;
		int m = (n - 1) / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Math.max(Math.abs(i - m), Math.abs(j - m)) + 1);
			}
			System.out.println();
		}
	}
}