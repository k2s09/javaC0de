import java.util.Scanner;

public class leapYear {
	public static void main(String args[]) {
		System.out.println(isIt());

	}

	public static boolean isIt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n = sc.nextInt();
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		sc.close();
		return false;
	}
}