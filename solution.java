import java.util.Scanner;

public class solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		n = 2 * n - 1;
		int x = (n - 1) / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(Math.max(Math.abs(i - x), Math.abs(j - x)) + 1);
			}
			System.out.println();
		}
	}
}