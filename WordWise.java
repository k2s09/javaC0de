import java.util.Scanner;

public class WordWise {
    String str;

    WordWise() {
        str = "";
    }

    public static void main(String[] args) {
        WordWise obj = new WordWise();
        obj.readsent();
        obj.arrange();
    }

    void readsent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        str = sc.nextLine();
        sc.close();
    }

    int freq_vowel(String w) {
        w = w.toLowerCase();
        int count = 0;
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'e' || ch == 'o' || ch == 'u')
                count += 1;
        }
        return count;
    }

    void arrange() {
        str = str.trim().concat(" ");
        String words[] = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " " + freq_vowel(words[i]));
        }
    }
}
