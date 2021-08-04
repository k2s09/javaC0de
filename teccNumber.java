import java.util.Scanner;

public class teccNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        String str = String.valueOf(num);
        int length = str.length();
        String str2 = str.substring(0, ((length / 2)));
        String str3 = str.substring(length / 2);

        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);
        double product = Math.pow((num2 + num3), 2);
        if (product == num)
            System.out.println("It is a tecc number");
        else
            System.out.println("It is not a tech number");
    }
}    


