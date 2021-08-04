import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divisibility_11 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int num = Integer.parseInt(br.readLine());
        String strNum = Integer.toString(num);
        int length = strNum.length();
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < length; i++) {
            if ((i + 1) % 2 == 0)
                evenSum += (int) (strNum.charAt(i));
            if ((i + 1) % 2 != 0)
                oddSum += (int) (strNum.charAt(i));
        }

        double answer = (Math.abs((oddSum - evenSum)));
        if (((oddSum - evenSum) == 0) || (answer % 11 == 0))
            System.out.println(num + " is divisible by 11");
        else
            System.out.println(num + " is not divisible by 11");
    }
}