// Perform a lot of tasks on arrays

import java.util.Arrays;
import java.util.Scanner;

public class arrTools {
	public static void main(String[] args) {
		int[][] arr = input();
		print(arr);
		rotate(arr);
		transpose(arr);
		int[][] b = input();
		addSubtract(arr, b);
		multiply1(arr, 5);
	}

	static int[][] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int r = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int c = sc.nextInt();
		System.out.println("Enter " + (r * c) + " elements");
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}

	static void print(int[][] arr) {
		for (int[] ints : arr) {
			System.out.println(Arrays.toString(ints));
		}
	}

	static void transpose(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		int[][] trans = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				trans[i][j] = arr[j][i];
			}
		}
		System.out.println("Transposed array: ");
		print(trans);
	}

	static void addSubtract(int[][] a, int[][] b) {
		if (a.length != b.length && a[0].length != b[0].length) {
			System.out.println("Matrices have different sizes!");
			return;
		}
		int[][] sum = new int[a.length][a[0].length];
		int[][] difference = new int[a.length][a[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				difference[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("Sum of the matrices: ");
		print(sum);
		System.out.println("Difference between the matrices: ");
		print(difference);
	}

	static void multiply1(int[][] a, int b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] *= 2;
			}
		}
		System.out.println("Product matrix: ");
		print(a);
	}

	// Rotate an array 90 degrees clockwise
	static void rotate(int[][] arr) {
		int[][] rot = new int[arr.length][arr[0].length];
		for (int i = 0, k = arr.length; i < rot.length; i++, k--) {
			for (int j = 0; j < rot[i].length; j++) {
				rot[j][k] = arr[i][j];
			}
		}
		System.out.println("pi/2 rad rotated clockwise matrix: ");
		print(rot);
	}
}