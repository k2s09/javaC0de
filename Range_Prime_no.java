import java.util.Scanner;

public class Range_Prime_no {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lowest number of the series");
		int l = sc.nextInt();
		System.out.println("Enter the highest number of the series");
		int h = sc.nextInt();
		for (double k = l; k <= h; k++) {
			int count = 0;
			for (int i = 1; i <= k; i++) {

				if (k % i == 0)
					count++;
			}
			if (count == 2)
				System.out.print((int) k + " ");
		}
	}
}
