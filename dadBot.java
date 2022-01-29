import java.util.Scanner;

public class dadBot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String str = sentence.toLowerCase();
		int index1 = str.indexOf("im");
		int index2 = str.indexOf("i\'m");
		int index3 = str.indexOf("i am");

		String response = "Hi ";
		if (index1 != -1) {
			response += sentence.substring(index1 + 3);
			System.out.println(response + ", I'm Dad!");
		} else if (index2 != -1) {
			response += sentence.substring(index2 + 4);
			System.out.println(response + ", I'm Dad!");
		} else if (index3 != -1) {
			response += sentence.substring(index3 + 5);
			System.out.println(response + ", I'm Dad!");
		}
		if (str.contains("are you winning dad"))
			System.out.println("Yes I'm winning son");
	}
}