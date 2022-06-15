import java.util.Scanner;

public class SumOddNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int no = sc.nextInt();
		no--;
		int sum = 1, y = 1;
		System.out.println(y);
		for (int i = 1; i <= no; i++) {

			y += 2;
			sum += y;
			System.out.println(" + " + y);

		}
		System.out.print(" = " + sum);
	}
}
