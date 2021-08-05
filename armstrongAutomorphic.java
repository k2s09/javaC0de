// Checking if numbers entered are armstrong and automorphic

import java.util.Scanner;

class armstrongAutomorphic {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter number to check for armstrong number: ");
		int num = Sc.nextInt();
		Sc.close();
		int numCopy = num;
		int digit;
		int product = 0;
		String strNum = String.valueOf(num);
		int length = strNum.length();
		for (int i = 0; i < length; i++) {
			digit = num % 10;
			digit = (digit * digit * digit);
			product += digit;
			num /= 10;
		}
		if (product == numCopy)
			System.out.println("It is an armstrong number");
		else
			System.out.println("It is not an armstrong number \nProduct of digits cubed: " + product);

		System.out.print("Enter number to check for automorphic number: ");
		num = Sc.nextInt();
		strNum = String.valueOf(num);
		length = strNum.length();
		product = (num * num);
		double dig = product % (Math.pow(10, length));
		if (dig == num)
			System.out.println("It is an automorphic number");
		else
			System.out.println("It is not an automorphic number \nSquare of num is: " + product + " and should have been " + dig);
	}
}
/**
 * Variable Data Table
 * Variable Name    Data type   Function
 * num, numCopy     int         Used to store number entered by user
 * digit, product   int         Used in calculation
 * strNum           String      Used to convert number to string
 * length           int         Used to find length of string
 * dig              int         Used in calculation of product
 */
