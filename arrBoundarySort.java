import java.util.Scanner;

public class arrBoundarySort {
	public static void main(String[] args) {
		// Taking inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of square");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int[] boundary = new int[(n - 1) * 4];
		System.out.println("Enter " + (n * n) + " elements");
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if (i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
					boundary[count] = arr[i][j];
					++count;
				}
			}
		}
		sc.close();
		// Sorting 1D Array
		System.out.println(Arrays.toString(boundary));
		Arrays.sort(boundary);
		// Putting the elements back in 2D array
		// 1st row
		count = 0;
		for (int i = 0; i < n; i++) {
			arr[0][i] = boundary[count];
			++count;
		}
		// Last column
		for (int i = 1; i < n; i++) {
			arr[i][n - 1] = boundary[count];
			++count;
		}
		// Last row
		for (int i = n - 2; i >= 0; i--) {
			arr[n - 1][i] = boundary[count];
			++count;
		}
		// First column
		for (int i = n - 2; n >= 1; n--) {
			arr[i][0] = boundary[count];

		}
		// Printing the final output
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}