import java.util.Scanner;

public class Saddlepoint {

	public static void main(String[] args) {

		// Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter " + (r * c) + " elements: ");
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				arr[i][j] = sc.nextInt();
		sc.close();

		// Finding saddle point
		int flag = 0;
		for (int i = 0; i < r; i++) {
			// Finding the smallest number in the row
			int rowMin = arr[i][0], col = 0;
			for (int j = 1; j < c; j++) {
				if (arr[i][j] < rowMin) {
					rowMin = arr[i][j];
					col = j;
				}
			}
			// Finding the biggest number in the same column
			int colMax = 0, row = 0;
			for (int j = 0; j < r; j++) {
				if (arr[j][col] > colMax) {
					colMax = arr[j][col];
					row = j;
				}
			}
			if (rowMin == colMax) {
				System.out.println("Saddle point found: " + rowMin + "\nIndex: " + row + "," + col);
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("Saddle point not found");
	}
}