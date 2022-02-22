// For all values of z ranging from -4 to 4
// f(x) = (z^2 +2z)/(z-1)
public class question1 {
	public static void main(String args[]) {
		double f = 0;
		for (int z = -4; z <= 4; z++) {
			f = ((z * z) + 2 * z) / (z - 1.0);
			System.out.println(f);
		}
	}
}
