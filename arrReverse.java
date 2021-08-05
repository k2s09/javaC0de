// Reversing an array

import java.util.Scanner;

public class arrReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements in array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = arr[i];
		}
		System.out.println("Reversed array:");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
