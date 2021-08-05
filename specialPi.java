import java.util.Scanner;

public class specialPi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter level of precision");
		int precision = sc.nextInt();
		sc.close();
		double pi = 4.0d;
		int num = 3, den = 4;
		for (int i = 1; i <= precision; i++) {
			if (i == 1) {
				pi *= num / den;
				continue;
			}
			num = nextPrime(num);
			den = nearestFour(num);
			pi *= ((double) (num) / (double) (den));
		}
		System.out.println("Value of π: " + pi);
	}

	public static boolean isPrime(int num) {
		int flag = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag += 1;
				break;
			}
		}
		if (flag == 0)
			return true;
		else
			return false;
	}

	public static int nearestFour(int num) {
		double answer = (4.0 * Math.floor(num / 4.0));
		return (int) (answer);
	}

	public static int nextPrime(int prevPrime) {
		int flag = 0;
		for (int i = prevPrime + 2; flag == 0; i += 2) {
			if (isPrime(i))
				return i;
		}
		return 69;
	}
}
