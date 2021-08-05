class columnMaster {
	public static void main(String args[]) {
		// Declaring 4 by 3 2D array
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

		int sum = 0;

		// Code for summing each columns
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				sum += arr[j][i];
			}
			System.out.println("Sum of column " + (i + 1) + " = " + sum);
			sum = 0;
		}
	}
}
