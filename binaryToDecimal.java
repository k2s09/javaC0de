import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        int num = sc.nextInt();
        String strNum = Integer.toString(num);
        StringBuffer sb = new StringBuffer(strNum);
        sb.reverse();
        strNum = sb.toString();
        double sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            char ch = strNum.charAt(i);
            if (ch == '1')
                sum += (Math.pow(2, i));
        }
        System.out.println("Decimal number is " + sum);
        sc.close();
    }
}
