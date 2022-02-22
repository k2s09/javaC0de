import java.util.Scanner;
public class MatRev {
	int[][] arr;
	int m, n;
	MatRev(int mm, int nn) {
		m = mm;
		n = nn;
		arr = new int[m][n];
	}
	public static void main(String args[]) {
		MatRev A = new MatRev(3,3);
		A.fillarray();
		A.revMat(A);
		A.show();
	}
	void revMat(MatRev P) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = reverse(P.arr[i][j]);
			}
		}
	}
	void fillarray() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	static int reverse(int a) {
		String str = ""+a;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		return Integer.parseInt(str);
	}
	void show() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
