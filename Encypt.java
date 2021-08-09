import java.util.Scanner;
class Round1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(), ns = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a')
					ns += 'z';
				else ns += (char)(ch-1);
			} else if (Character.isDigit(ch)) {
				if (ch == '9')
					ns += '0';
				else ns += (ch - 48) + 1;
			} else ns += '!'; }
		int C = sc.nextInt(), R = ns.length()/C;
		char[][] arr = new char[R][C];
		for (int i = 0, count = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				arr[i][j] = ns.charAt(count++);
		for (int i = 0; i < C; i++)
			for (int j = 0; j < R; j++) {
				if (i % 2 == 0)
					System.out.print(arr[j][i]);
				else
					System.out.print(arr[R-1-j][i]);
			}
	}
}