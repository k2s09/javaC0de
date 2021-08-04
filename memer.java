//  Making a proper meme sentence

import java.util.Scanner;

public class memer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = sc.nextLine();
        // Splitting sentence
        sentence = sentence.trim().toLowerCase().concat(" ");
        String[] words = sentence.split(" ");
        // Doing uppercase to every char at an even index
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if ((j + 1) % 2 == 0) {
                    words[i] = words[i].substring(0, j) + (char) ((words[i].charAt(j)) - 32) + words[i].substring(j + 1);
                }
            }
        }
        // Appending words
        sentence = "";
        for (String word : words) {
            sentence += word + " ";
        }
        System.out.println(sentence);
    }
}