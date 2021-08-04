import java.util.Scanner;

class Type_Conversion {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        char c = 'A';
        System.out.println("Enter number to be added ");
        int n = Sc.nextInt();
        int g = c + n;
        char ch = (char) g;
        System.out.println("If c = 'A' ,ch (which is c+10) = " + ch);
    }
}