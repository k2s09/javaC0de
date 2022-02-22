import java.util.Scanner;

public class Neil_Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt(), k = no, dig = 0, sum = 0;
		while (k > 0) {
			dig = k % 10;
			k = k / 10;
			sum += dig * dig * dig;
		}
		if (sum == no)
			System.out.println("It is a Neil Armstrong number");
		else
			System.out.println("It is not a Neil Armstrong number");
	}
}
