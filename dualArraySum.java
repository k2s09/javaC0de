import java.util.Scanner;

public class dualArraySum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of first and second arrays in quick succession: ");
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int arr1[] = new int[l1];
		int arr2[] = new int[l2];
		int arr3[] = new int[l1 + l2];
		// Combining the arrays
		int counter = 0;
		for (int i = 0; i < l1 + l2; i++) {
			if (i <= l1)
				arr3[i] = arr1[i];
			if (i > l1) {
				arr3[i] = arr2[counter];
				counter += 1;
			}
		}
		// Printing final array
		for (int i = 0; i < arr3.length; i++)
			System.out.println(arr3[i]);
	}
}