// Write a program to accept a string and return the new string after removing all repeated characters
import java.util.Scanner;
public class recursionQuestion {
    static int length;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine() + " ";
        sc.close();
        length = str.length();
        System.out.println(removeAdjacentDuplicates(str, 0));
    }
    static String removeAdjacentDuplicates(String str, int i) {
        // Base case
        if (i == str.length() - 2)
            return str;
        // Condition
        if (str.charAt(i) == str.charAt(i+1)) {
            str = str.substring(0,i+1) + str.substring(i+2);
            return removeAdjacentDuplicates(str, ++i);
        }
        return removeAdjacentDuplicates(str, ++i);
    }
}