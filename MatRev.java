import java.util.Scanner;
public class MatRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter " + (r*c) + " elements: ");
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int tmp = sc.nextInt();
				arr[i][j] = reverse(tmp);
			}
		}
		sc.close();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int reverse(int a) {
		String str = ""+a;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		return Integer.parseInt(str);
	}
}
