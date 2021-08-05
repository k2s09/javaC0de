public class fb {
	public static void main(String args[]) {
		for (int i = 1; i < 51; i += 1) {
			int flag = 0;
			String str = Integer.toString(i);
			// Checks if i is divisible by 3
			int sum = 0;
			for (int j = 0; j < str.length(); j++) {
				sum += (int) (str.charAt(j));
			}
			if (sum % 3 == 0) {
				System.out.print("Fizz");
				flag += 1;
			}
			// Checks if i is divisible by 5
			char lastChar = str.charAt(str.length() - 1);
			if (lastChar == '0' || lastChar == '5') {
				System.out.print("Buzz");
				flag += 1;
			}
			// If those two aren't satisfied
			if (flag == 0)
				System.out.print(i);
			for (int x = 1; x < 2; x++)
				System.out.println();
		}
	}
}