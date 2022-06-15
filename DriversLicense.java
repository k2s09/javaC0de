import java.util.Scanner;

class DriversLicense {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int age = 0;
		String marr;
		System.out.println(" Enter your name ");
		String name = Sc.next();
		do {
			System.out.println(" Enter your age ");
			age = Sc.nextInt();
		} while (age < 25);
		do {
			System.out.println(" Enter your marital status (married/unmarried)");
			marr = Sc.next();
		} while (marr == "unmarried");
		System.out.println(" You can be a driver! ");
	}
}
        