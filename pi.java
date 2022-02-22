import java.util.Scanner;

public class pi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter precision");
		int precision = sc.nextInt();
		sc.close();
		double pi = 3.0 / 4.0;
		int num = 3;
		int den = 4;
		for (int i = 1; i < precision; i++) {
			System.out.println(num + " " + den);
			num = nextPrime(num);
			den = nextFour(num);
			pi *= num / den;
		}
		pi *= 4.0;
		System.out.println("π" + pi);
	}

	public static boolean isPrime(int num) {
		int flag = 0;
		for (int i = 2; i < num / 2; i++) {
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

	public static int nextFour(int num) {
		double answer = (4.0 * Math.round(num / 4.0));
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
