// Convert "Hello world" to  "8 5 12 12 15 23 15 18 12 4"
public class convert {
	public static void main(String args[]) {
		String sentence = "Hello world";
		// Clean string
		sentence = sentence.trim().toLowerCase().replaceAll(" ", "");
		// Print output
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			System.out.print(ch - 'a' + 1 + " ");
		}
		// Now do the other way round
		int numbers[] = {8, 5, 12, 12, 15, 23, 15, 18, 12, 4};
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((char) (numbers[i] + 96) + " ");
		}

		// Now if the numbers are above 26, what do you do? You repeat it. a is 1. a is also 27 (after 26 it starts again). e is 5 and also 31.
		System.out.println(31 % 26);
	}
}