import java.util.Scanner;

public class Char_Int {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter any leter ");
		char a = Sc.next().charAt(0);
		int n = (int) a;
		System.out.println(" Your letter has the integer value of " + n);
	}
}

