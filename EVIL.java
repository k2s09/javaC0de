// Even number of 1's in binary form
import java.util.Scanner;
public class EVIL {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int no = sc.nextInt();
        sc.close();
        String binary = Integer.toBinaryString(no);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1')
                count += 1;
        }
        if (count % 2 == 0)
            System.out.println("EVIL");
        else
            System.out.println("NOT EVIL");
    }
}