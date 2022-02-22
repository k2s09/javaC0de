import java.util.Scanner;

public class shiftArray {
	public static void main(String args[]) {
		// Taking inputs
		Scanner sc = new Scanner(System.in);
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		System.out.println("Enter number and position: ");
		int number = sc.nextInt();
		int position = sc.nextInt();
		sc.close();
		// Shifting array
		int temp = 0;
		for (int i = position; i < 9; i++) {
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
			temp = arr[i];
		}
		arr[position] = number;
		// Print result array
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}