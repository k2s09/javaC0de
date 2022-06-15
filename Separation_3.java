//Program to sepaerate

import java.util.Scanner;

public class Separation_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number,no more no less.Uderstood?");
		int n = sc.nextInt();
		int a = n % 100;
		int b = n - a;
		int fd = b / 100;
		int c = a % 10;
		int d = a - c;
		int sd = d / 10;
		System.out.println("the first digit is " + fd + " the second digit is " + sd + " and the last digit is " + c);
	}
}