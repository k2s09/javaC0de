// To take length, breadth, depth of a box and calculate it's 

import java.util.Scanner;

class Box {
	double length, width, height;

	public static void main(String args[]) {
		Box b = new Box();
		b.input();
		b.volume();
	}

	void input() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter length, width, height");
		length = Sc.nextInt();
		width = Sc.nextInt();
		height = Sc.nextInt();
	}

	void volume() {
		double vol = length * width * height;
		System.out.println("The volume of a box is " + vol);
	}
}
