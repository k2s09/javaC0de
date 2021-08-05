import java.util.Scanner;

public class Emrip_No {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt(), k = no, dig = 0, sum = 0, count = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0)
				count++;
		}
		if (count == 2) {
			while (k > 0) {
				dig = k % 10;
				sum = sum * 10 + dig;
				k /= 10;
			}
			count = 0;
			for (int j = 1; j <= sum; j++) {
				if (sum % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println("It is an emrip number");
			else
				System.out.println("It is not an emrip number");
		} else
			System.out.println("It is not an emrip number");
	}
}