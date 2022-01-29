import java.util.Scanner;

class Sum {
	public static void main(String args[]) {
		int arr[] = new int[5];
		int sum = 0;
		Scanner Sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter value");
			arr[i] = Sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Sum is " + sum);
	}
}
        