import java.util.Scanner;

public class centeredPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		sc.close();
		for (int i = 1; i <= rows; i++) {
			// Adds spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// Adds asterisks
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			// Adds line break
			System.out.println();
		}
	}
}