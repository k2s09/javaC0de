import java.util.Scanner;

class cursedUwu {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = Sc.nextLine();
		sentence = sentence.replace('l', 'w');
		sentence = sentence.replace('r', 'w');
		System.out.println(sentence);
	}
}
