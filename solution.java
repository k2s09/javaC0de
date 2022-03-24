import java.util.Scanner;
class solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (check1(a[i],b[j]) && check2(a[i],b[j]))
					System.out.println((i+1) + "," + (j+1));

	}
	static boolean check1(int a, int b) {
		int f1 = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0)
				++f1;
		}
		int f2 = 0;
		for (int i = 2; i < b; i++) {
			if (b % i == 0)
				++f2;
		}
		return (f1 == f2);
	}
	static boolean check2(int a, int b) {
		String str = Integer.toBinaryString(a);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1')
				++count;
		}
		String str2 = String.valueOf(b);
		return (String.valueOf(b).contains(String.valueOf(count)));
	}
}