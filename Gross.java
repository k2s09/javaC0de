// program to calculate gross values 

import java.util.Scanner;

class Gross {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter basic salary ");
		int basic = Sc.nextInt();
		int DA = (basic * 20 / 100);
		int HRA = (basic * 40 / 100);
		int gross = (basic + DA + HRA);
		System.out.println(" The gross salary is " + gross);
	}
}