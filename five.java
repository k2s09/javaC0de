// Find LCM of whatever numbers you want

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers seperated by spaces");
        String line = sc.nextLine();
        line = line.trim().concat(" ");
        String str[] = line.split(" ");
        int arr[] = new int[str.length]; // Seperates sentence to invididual words to numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(str[i]);
        }
        int thingy = lcm(arr[0], arr[1]); // Finding lcm of first two, then the LCM of that with the third, then that with the fourth and so on
        for (int i = 2; i < arr.length; i++) {
            thingy = lcm(thingy, arr[i]);
        }
        System.out.println(thingy);
    }

    public static int lcm(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber; // Maths prebuilt formula, dont bother with logic
        }
        return lcm;
    }
}
