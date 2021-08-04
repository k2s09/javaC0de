import java.util.Scanner;

public class pairOfVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.trim().toUpperCase();
        int count = 0;
        for (int i = 0; i < sentence.length() - 1; i++) {
            char ch = sentence.charAt(i);
            char wh = sentence.charAt(i + 1);
            if (wh == 'A' || wh == 'E' || wh == 'I' || wh == 'O' || wh == 'U') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count += 1;
                    System.out.print("" + ch + wh + " ");
                }
            }
        }
        System.out.println("\nTotal number of vowel pairs found: " + count);
    }
}