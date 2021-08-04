// Write a program to initialize the seven Wonders of the World along with their
// locations into two different arrays. Search for a name of the country input 
// by the user andn display if found, the wonder along in it, otherwise display
// Sorry, Not Found!

import java.util.Scanner;

public class wondersAndLocations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String wonder[] = new String[3];
        String country[] = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of country: ");
            country[i] = sc.next();
            System.out.println("Enter wonder in " + country[i]);
            wonder[i] = sc.next();
        }

        System.out.println("Enter country you want to check: ");
        String check = sc.next();
        int flag = 1;
        for (int i = 0; i < 3; i++) {
            if (country[i].equalsIgnoreCase(check)) {
                flag += i;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Sorry, Not Found!");
        else if (flag > 1)
            System.out.println(country[flag - 1] + " - " + wonder[flag - 1]);
    }
}
