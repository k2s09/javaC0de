import java.util.Scanner;

public class s_Palindrome {
	public static void main(String args[]) {
		//Taking input
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter string sentence");
		String s = Sc.nextLine();

		//Trimming the string
		s = s.trim();
		s += " ";

		// Separating the individual words in the sentence
		String wrd = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ')
				wrd += ch;
			else if (ch == ' ') {
				StringBuffer sb = new StringBuffer(wrd);
				StringBuffer rev = new StringBuffer();
				rev = sb.reverse();
				String a = rev.toString();
				System.out.println("Is " + wrd + " palindrome? " + a.equalsIgnoreCase(wrd));
				wrd = "";
			}
		}
	}
}
