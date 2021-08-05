// Enter 5 numbers and print larest even number and print smallest odd number

import java.util.Scanner;

class revTest {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Sc.nextInt();
		}

		//Sorting the values in ascending order using selection sort
		int min, temp;
		for (int i = 0; i < 20; i++) {
			min = i;
			for (int j = (i + 1); j < 20; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}


		int even[] = new int[5];
		int odd[] = new int[5];

		// Finding all even values and finding largest
		int c1 = 0;
		int eL = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				even[i] = arr[i];
				c1 += 1;
				eL = arr[i];
			}
		}
		if (c1 == 0)
			System.out.println("No even number found");
		else
			System.out.println("Largest even number: " + eL);


		//Finding all odd values and finding smallest
		int oS1 = 0;
		int oS2 = 0;
		int c2 = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 != 0) {
				odd[i] = arr[i];
				c2 += 1;
				oS1 = odd[i];
			}
			if (c2 == 1)
				oS2 = oS1;
		}
		if (c2 == 0)
			System.out.println("No odd number found");
		else
			System.out.println("Smallest odd number: " + oS2);
	}
}
      