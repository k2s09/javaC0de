public class sortSearch {
	static int arr1[] = {2, 4, 3, 5, 1};
	static int arr2[] = {40, 10, 20, 50, 30};
	static int flag = 0;

	public static void main(String args[]) {
		System.out.println("Unsorted array 1: ");
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");

		System.out.println("Using linear search, finding 5");
		linearSearch(5);

		System.out.println("Sorting array using Selection Sort");
		selectionSort();
		for (int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");

		System.out.println("Unsorted array 2: ");
		for (int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");

		System.out.println("Sorting array using Bubble Sort");
		bubbleSort();
		for (int a = 0; a < arr2.length; a++)
			System.out.print(arr2[a] + " ");

		System.out.println("Using binary search, finding 20");
		binarySearch(20);

	}

	static void linearSearch(int element) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == element) {
				System.out.println("Element found at " + (i + 1) + "th index");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Element not found");
	}

	static void selectionSort() {
		int min, temp;
		for (int i = 0; i < arr1.length; i++) {
			min = i;
			for (int j = (i + 1); j < arr1.length; j++) {
				if (arr1[j] < arr1[min])
					min = j;
			}
			temp = arr1[i];
			arr1[i] = arr1[min];
			arr1[min] = temp;
		}
	}

	static void bubbleSort() {
		int temp = 0;
		flag = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < ((arr2.length) - i - 1); j++) {
				if (arr2[j] > arr2[j + 1]) {
					temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
					flag++;
				}
			}
			if (flag == 0)
				break;
			else
				flag = 0;
		}
	}

	static void binarySearch(int element) {
		int l = 0, u = (arr2.length - 1);
		int m; // Counter is stopped at 4
		while (l <= u) {
			m = (l + u) / 2;
			if (element > arr2[m])
				l = m + 1;
			else if (element < arr2[m])
				u = m - 1;
			else {
				System.out.println("Element found at " + (m + 1));
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Element not found");
	}
}