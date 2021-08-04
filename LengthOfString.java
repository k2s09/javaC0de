import java.util.Scanner;

class LengthOfString {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter string ");
        String str = Sc.next();
        int length = str.length();
        System.out.println(" Length of string is " + length);
    }
}