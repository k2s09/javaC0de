// Program to print the average of three subjects given by user

import java.util.Scanner;

class Average {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter English marks out of 100 ");
		int eng = Sc.nextInt();
		System.out.println(" Enter Maths marks out of 100 ");
		int maths = Sc.nextInt();
		System.out.println(" Enter marks of Computers out of 100 ");
		int comp = Sc.nextInt();
		double aver = (eng + maths + comp) / 3;
		System.out.println(" The average is " + aver);
	}
}