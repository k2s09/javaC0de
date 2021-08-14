import java.util.Scanner;
public class Adder {
	int[] a;
	Adder() {
		a = new int[2];
	}
	void readtime() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
	}
	void addtime(Adder X, Adder Y) {
		this.a[0] = X.a[0] + Y.a[0];
		this.a[1] = X.a[1] + Y.a[1];
		if (this.a[1] > 60) {
			this.a[0] += 1;
			this.a[1] %= 60;
		}
	}
	void disptime() {
		System.out.println("hours = " + a[0] + " and minutes = " + a[1]);
	}
	public static void main(String[] args) {
		Adder X = new Adder();
		Adder Y = new Adder();
		X.readtime();
		Y.readtime();
		Adder Z = new Adder();
		Z.addtime(X, Y);
		Z.disptime();
	}
}
