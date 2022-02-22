import java.util.Scanner;

public class hew {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String str = sc.next();
		try {
			System.out.println(str.substring(2));
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}