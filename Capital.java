// Check whether a sentence has words beginning with a capital letter or not

import java.util.Scanner;

public class Capital {
    String sent;
    int freq;

    Capital() {
        sent = "";
        freq = 0;
    }

    public static void main(String[] args) {
        Capital obj = new Capital();
        obj.input();
        obj.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        sent = sc.nextLine();
        sc.close();
    }

    boolean isCap(String w) {
        if (Character.isUpperCase(w.charAt(0)))
            return true;
        else
            return false;
    }

    void display() {
        System.out.println(sent);
        // Find frequency of words beginning with a capital letter
        int a = 0, b;
        for (int i = 0; i < sent.length(); i++) {
            b = sent.indexOf(' ', i);
            String word = sent.substring(a, b + 1);
            a = b;
            System.out.println("Word: " + word);
        }
    }
}
