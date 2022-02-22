// put code here
import java.util.Scanner;
public class desks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((int)(Math.ceil((a+b+c)/2.0)));
	}
}
