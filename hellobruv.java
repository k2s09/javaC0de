import java.util.Scanner;

public class hellobruv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence = sc.nextLine();
		sc.close();
		sentence = sentence.substring(2);
		System.out.println(sentence);
	}
}