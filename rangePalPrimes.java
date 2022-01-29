// Prints numbers which are palindromes and primes within specified range

import java.util.Scanner;

public class rangePalPrimes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower value:");
		int lower = sc.nextInt();
		System.out.println("Enter upper value");
		int upper = sc.nextInt();
		rangePalPrimes obj = new rangePalPrimes();
		for (int i = lower; i < upper; i++) {
			boolean b1 = obj.palindrome(i);
			if (b1 == false)
				continue;
			boolean b2 = obj.prime(i);
			if (b1 == true && b2 == true)
				System.out.println(i + " is a palprime");
		}
	}

	boolean palindrome(int num) {
		String str = Integer.toString(num);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String reversed = sb.toString();
		if (str.equals(reversed))
			return true;
		else
			return false;
	}

	boolean prime(int num) {
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				flag += 1;
		}
		if (flag == 0)
			return true;
		else
			return false;
	}
}
