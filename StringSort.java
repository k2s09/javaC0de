import java.util.Scanner;

class StringSort {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter word");
        String s = Sc.nextLine();
        s = s.toLowerCase();
        // Sorting using selection sort
        s = s.trim();
        char arr[] = s.toCharArray();
        int min;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            min = i;
            for (int j = i + 1; j < s.length(); j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        //Printing values 
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] != ' ')
                System.out.print(arr[i]);
        }
        System.out.println();
    }
}
/**
 * Variable Data Table
 * Variable    Data type   Function
 * s           String      To store word entered by user
 * arr[]       char        To store char array of word
 * min         int         Used in calculations
 * temp        char        Used for swapping
 * i,j         int         Used to control loop iterations
 */