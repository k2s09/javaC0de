import java.util.Scanner;

class SentenceVowCon {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String s = Sc.nextLine();
        s = s.trim();
        s = s.toLowerCase();
        s += " ";
        char ch;
        int a = s.length();
        String w = "";
        int c = 0, b = 0;
        System.out.println();
        for (int i = 0; i < a; i++) {
            ch = s.charAt(i);
            if (ch != ' ')
                w += ch;
            if (ch == ' ') {
                char wh = w.charAt(0);
                if (wh == 'a' || wh == 'e' || wh == 'i' || wh == 'o' || wh == 'u') {
                    System.out.println(w + " begins with a vowel");
                    c += 1;
                } else {
                    System.out.println(w + " begins with a consonant");
                    b += 1;
                }
                w = "";
            }
        }
        System.out.println("\nTotal number of words starting with vowels: " + c + "\nTotal number of words starting with consonants: " + b);
    }
}
/**
 * Variable Data Table
 * Variable    Data type   Function
 * s           String      To store sentence entered
 * ch,wh       char        Used in calculation
 * a           int         Used to store length of sentence
 * w           String      Used to store word from sentence
 * c,b         int         Used as counters
 */
