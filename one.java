// Sum of multiples of 3 and 5 from 1 to 1000
public class one {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}
