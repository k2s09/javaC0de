// 2019

import java.util.Scanner;

class BubbleSort {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter 15 integers");
        int arr[] = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = Sc.nextInt();
        }
        int flag = 0, temp;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 14 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag += 1;
                }
            }
            if (flag == 0)
                break;
            else
                flag = 0;
        }
        System.out.println("Sorted array:");
        for (int x = 0; x < 15; x++)
            System.out.println(arr[x]);
    }
}
            