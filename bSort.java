// Program to sort array using Bubble Sort algorithm

import java.util.Scanner;

class bSort {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++)
			arr[i] = Sc.nextInt();
		// Using bubble sort
		int temp, flag = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag++;
				}
			}
			if (flag == 0)
				break;
			else
				flag = 0;
		}
		// Printing sorted array
		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
/**
 * Variable data table
 * Variable    Data type   Function
 * arr[]       int         Used to store numbers of array
 * temp,flag   int         Used in calculation
 */
