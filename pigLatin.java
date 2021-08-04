import java.util.Scanner;

public class pigLatin {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = new String(Sc.next());

        word = word.trim();
        word = word.toUpperCase();

        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(word.substring(i) + word.substring(0, i) + "AY");
                break;
            }
        }
    }
}

      