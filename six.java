// difference between sum of squares of first hundred natural numbers and square of the sum
public class six {
	public static void main(String[] args) {
		double sum1 = 50 * (1 + 100);
		sum1 = Math.pow(sum1, 2);
		double sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			sum2 += (i * i);
		}
		System.out.println(sum1 + "\n" + sum2 + "\n" + (sum2 - sum1));
	}
}
