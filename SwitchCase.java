// 2019

import java.util.Scanner;

class SwitchCase {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter choice from menu: \n1. Print letters with unicode value\n2. Number pattern");
		int choice = Sc.nextInt();
		switch (choice) {
			case 1:
				for (char ch = 'A'; ch <= 'Z'; ch++) {
					int a1 = (int) ch;
					System.out.println(ch + "\t" + a1);
				}
				break;

			case 2:
				for (int i = 1; i < 6; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
		}
	}
}
      