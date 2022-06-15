import java.util.Scanner;

public class Multiplication_Tables {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter multiple");
		int n = Sc.nextInt();
		System.out.println("Enter number of iterations");
		int m = Sc.nextInt();
		int c = 1;
		for (int i = 1; i <= m; i++) {
			System.out.println(n + " * " + c + " = " + (n * c));
			c++;
		}
	}
}
