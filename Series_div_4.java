import java.util.Scanner;

public class Series_div_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms");
		int A = sc.nextInt();
		double sum = 0;
		int den = 4;
		for (double i = 1; i <= A; i++) {
			sum += 1.0 / den;
			den += 4;
		}
		System.out.print("The answer is " + sum);
	}
}

