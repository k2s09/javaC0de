// A pythagorean triplet which adds to 1000
public class nine {
	public static void main(String[] args) {
		for (int i = 2; i < 1000; i++) {
			for (int j = i + 1; j < 1000; j++) {
				for (int k = j + 1; k < 1000; k++) {
					if (isTriplet(i, j, k) == true && (i + j + k) == 1000) {
						System.out.println(i * j * k);
						System.exit(0);
					}
				}
			}
		}
	}

	public static boolean isTriplet(int p, int b, int h) {
		int pb = ((p * p) + (b * b));
		if (pb == (h * h))
			return true;
		else
			return false;
	}
}
