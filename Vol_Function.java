import java.util.Scanner;

public class Vol_Function {
	double width, height, depth;

	public static void main(String k[]) {
		Vol_Function b = new Vol_Function();
		b.input();
		b.volume();
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width,height and depth");
		width = sc.nextDouble();
		height = sc.nextDouble();
		depth = sc.nextDouble();
	}

	void volume() {
		double vol = width * height * depth;
		System.out.println("The volume of the box is " + vol);
	}
}

