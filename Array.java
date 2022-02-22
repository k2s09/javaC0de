import java.util.Scanner;

class Array {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		double percent;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter marks of different subjects out of 100");
			arr[i] = Sc.nextInt();
			sum += arr[i];
		}
		percent = (sum / 500) * 100;
		System.out.println("Sum of subjects is " + sum + " out of 500");
		System.out.println("Percentage is " + percent);
	}
}
