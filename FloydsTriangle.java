import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter number of iterations");
		int n = Sc.nextInt();
		int i, j;
		int c = 1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}
}
