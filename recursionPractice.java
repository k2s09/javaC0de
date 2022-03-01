// Write a program to enter a number and print the fibonacci series of n terms using function fibo(int n) using recursion
// Accept a decimal number and return its binary equivalent using recursion
public class recursionPractice {
	public static void main(String[] args) {
		System.out.println(decimalToBinary(1275));
		System.out.println(0 + "\n" + 1);
		System.out.println(fibo(10));
	}
	static int decimalToBinary(int n) {
		if (n == 0)
			return 0;
		return n % 2 + 10 * decimalToBinary(n / 2);
	}
	static int i = 0, j = 1, tmp = i + j;
	static int fibo(int n) {
		i = j;
		j = tmp;
		tmp = i+j;
		System.out.println(i);
		System.out.println(j);
		if (n == 0)
			return 0;
		return fibo(--n);
	}
}
