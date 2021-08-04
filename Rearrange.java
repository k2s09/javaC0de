// Bring all vowels of a word in the beginning following the consonants

import java.util.Scanner;

public class Rearrange {

    // Instance variables
    String wrd;
    String newwrd;

    // Default constructor
    Rearrange() {
        wrd = "";
        newwrd = "";
    }

    public static void main(String args[]) {
        Rearrange obj = new Rearrange();
        obj.readword();
        obj.freq_vow_con();
        obj.arrange();
        obj.display();
    }

    // Accept word in uppercase
    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        wrd = sc.next();
        sc.close();
    }

    // find frequency of vowels and consonants in the word and displays them with an appropriate message
    void freq_vow_con() {
        int vowNum = 0;
        int conNum = 0;
        // Traverse the string and check
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowNum += 1;
            else
                conNum += 1;
        }
        System.out.println("Number of vowels: " + vowNum);
        System.out.println("Number of consonants: " + conNum);
    }

    // rearranges the word by bringing the vowels at the beginning follows by the consonants
    void arrange() {
        String vowels = "";
        String consonants = "";
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowels += ch;
            else
                consonants += ch;
        }
        newwrd = vowels + consonants;
    }

    // displays the original word along with the rearranged word
    void display() {
        System.out.println(wrd + "\n" + newwrd);
    }
}