// Potential of a word is the sum of all the positions of all characters in the word
// apple -> 1+16+16+12+5 = 50

import java.util.Scanner;

public class numPotential {
    public static void main(String args[]) {
        // Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.concat(" ");
        // Finding number of words
        int noOfWords = 0;
        String s2 = sentence;
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (ch == ' ')
                noOfWords += 1;
        }
        System.out.println(" Number of words: " + noOfWords);
        // Seperating and storing words in an array
        String words[] = new String[noOfWords];
        int potentials[] = new int[noOfWords];
        String word = "";
        int arrCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ')
                word += ch;
            else {
                words[arrCount] = word;
                int potential = findPotential(word);
                potentials[arrCount] = potential;
                arrCount += 1;
                word = "";
            }
        }
        // Arranging words in increasing order of their potentials
        int min, temp;
        String temp2;
        for (int i = 0; i < arrCount; i++) {
            min = i;
            for (int j = (i + 1); j < arrCount; j++) {
                if (potentials[j] < potentials[min])
                    min = j;
            }
            // Swapping of potentials
            temp = potentials[i];
            potentials[i] = potentials[min];
            potentials[min] = temp;
            // Swapping of words
            temp2 = words[i];
            words[i] = words[min];
            words[min] = temp2;
        }
        // Printing words and their potentials
        System.out.println();
        for (int i = 0; i < arrCount; i++) {
            System.out.println(words[i] + " " + potentials[i]);
        }
    }

    // Calculating potential of each word
    public static int findPotential(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            sum += (int) (ch - 96);
        }
        return sum;
    }
}
