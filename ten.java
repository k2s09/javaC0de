// find the sum of all primes below two million
public class ten {
	public static void main(String[] args) {
		long sum = 1060l;
		int flag = 0;
		for (int i = 101; i < 2000000; i += 2) {
			if (i % 2 == 0)
				continue;
			for (int j = 3; j < (int) (Math.sqrt(i)); j += 2) {
				if (i % j == 0) {
					flag += 1;
					break;
				}
			}
			if (flag == 0) {
				sum += i;
			} else
				flag = 0;
		}
		System.out.println(sum);
	}
}
