import java.util.Arrays;
import java.util.Scanner;

public class arrRowShift {
	public static void main(String[] args) {
		// Taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int r = sc.nextInt();
		System.out.println("Enter columns: ");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter " + (r * c) + " elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		// Shifting the rows
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c; j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[i + 1][j];
				arr[i + 1][j] = tmp;
			}
		}
		for (int i = 0; i < r; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}