import java.util.Scanner;

public class Average_Sum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int no = 0;
		double sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter a number: ");
			no = sc.nextInt();
			sum += no;

		}
		System.out.println("The sum is " + sum);
		System.out.print("The average is " + sum / 5);
	}
}