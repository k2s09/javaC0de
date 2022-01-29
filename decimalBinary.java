// Converting decimal to binary and vice versa
import java.util.Scanner;
public class decimalBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in decimal: ");
        int n = sc.nextInt();
        // Convert to binary
        String binary = "";
        while (n > 0) {
            binary += (n % 2);
            n /= 2;
        }
        // Reverse and print
        String binary2 = binary;
        binary = (new StringBuffer(binary).reverse()).toString();
        System.out.println("Binary: " + binary);
        // Convert binary to decimal
        int decimal = 0;
        for (int i = 0; i < binary2.length(); i++) {
            if (binary2.charAt(i) == '1')
                decimal += (int)(Math.pow(2,i));
        }
        System.out.println("Decimal: " + decimal);
    }
}
/** Variable        Data        Table
 *  n               int         Store number entered by user
 *  binary          String      Convert to binary and reverse it
 *  binary2         String      Store the string before reversing
 *  decimal         int         Convert to decimal and store
 */