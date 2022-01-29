import java.util.Scanner;

public class FiboString {

	String x;
	String y;
	String z;
	int n;

	FiboString() {
		x = "a";
		y = "b";
		z = "ba";
	}

	public static void main(String[] args) {
		FiboString obj = new FiboString();
		obj.accept();
		obj.generate();
	}

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		n = sc.nextInt();
		sc.close();
	}

	void generate() {
		System.out.println(x + "\n" + y);
		for (int i = 0; i < n - 2; i++) {
			z = y + x;
			System.out.println(z);
			x = y;
			y = z;
		}
	}
}
