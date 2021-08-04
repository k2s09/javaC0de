import java.util.Scanner;

public class isogramSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String strReverse = (new StringBuffer(sentence).reverse()).toString();
        int flag = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != strReverse.charAt(i)) {
                flag += 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("The sentence is an isogram");
        else
            System.out.println("The sentence is not an isogram");
    }
}
