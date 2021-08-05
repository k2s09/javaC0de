/* 
   Using the switch statement, write a menu driven program to perform following 
operations: 
(i) To Print the value of Z where Z = xˆ3+0.5x/Y
where x ranges from – 10 to 10 with 
an increment of 2 and Y remains constant at 5.5.
(ii) To print the Floyds triangle with N rows 
Example: If N = 5, Output:
1 
2 3 
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;

public class boardQ {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter choice: ");
		int choice = Sc.nextInt();
		switch (choice) {
			case 1:
				final double Y = 5.5;
				double Z = 0.0;
				for (int x = -10; x <= 10; x += 2) {
					Z = (Math.pow(x, 3) + (0.5 * x)) / Y;
					System.out.println(Z);
				}
				break;
			case 2:
				int counter = 1;
				System.out.print("Enter number of rows: ");
				int N = Sc.nextInt();
				for (int i = 1; i <= N; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(counter + " ");
						counter += 1;
					}
					System.out.println();
				}
				break;
		}
		Sc.close();
	}
}














