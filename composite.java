public class composite {
	int[][] arr;
	int m, n;

	composite(int mm, int nn) {
		m = mm;
		n = nn;
		arr = new int[m][n];
	}

	public static void main(String[] args) {
		composite obj = new composite(4, 4);
		obj.fill();
		obj.display();
	}

	int isComposite(int n) {
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return 0;
		} else
			return 1;
	}

	void fill() {
		int[] comp = new int[m * n];
		// Finding m*n composite numbers
		int count = 0;
		for (int i = 1; count < m * n; i++) {
			int check = isComposite(i);
			if (check == 1) {
				comp[count] = i;
				++count;
			}
		}

		// Putting the composite numbers in 2d array
		count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = comp[count];
				++count;
			}
		}
	}

	void display() {
		for (int[] ints : arr) {
			for (int anInt : ints) {
				System.out.print(anInt + " ");
			}
			System.out.println();
		}
	}
}
