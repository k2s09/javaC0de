import java.util.Scanner;
import java.util.Arrays;
public class arrRowSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of colns: ");
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		if (m <= 2 || n <= 2 || m >= 10 || n >= 10) {
			System.out.println("Invalid size!");
			System.exit(0);
		}
		System.out.println("Enter " + (m*n) + " elements:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// Sort
		for (int i = 0; i < m; i++) {
			a[i] = oneDSort(a[i]);
		}
		// Print
		for (int i = 0; i < m; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}
	static int[] oneDSort (int arr[]) {
		// Selection Sort
		int min, temp;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (arr[i] != arr[min]) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}
}
