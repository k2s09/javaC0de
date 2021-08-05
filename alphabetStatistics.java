// Calculates the most and least used words in english on the basis of the 100 most common words
public class alphabetStatistics {
	public static void main(String args[]) {
		String arr[] = {
				"a",
				"about",
				"all",
				"also",
				"and",
				"as",
				"at",
				"be",
				"because",
				"but",
				"by",
				"can",
				"come",
				"could",
				"day",
				"do",
				"even",
				"find",
				"first",
				"for",
				"from",
				"get",
				"give",
				"go",
				"have",
				"he",
				"her",
				"here",
				"him",
				"his",
				"how",
				"I",
				"if",
				"in",
				"into",
				"it",
				"its",
				"just",
				"know",
				"like",
				"look",
				"make",
				"man",
				"many",
				"me",
				"more",
				"my",
				"new",
				"no",
				"not",
				"now",
				"of",
				"on",
				"one",
				"only",
				"or",
				"other",
				"our",
				"out",
				"people",
				"say",
				"see",
				"she",
				"so",
				"some",
				"take",
				"tell",
				"than",
				"that",
				"the",
				"their",
				"them",
				"then",
				"there",
				"these",
				"they",
				"thing",
				"think",
				"this",
				"those",
				"time",
				"to",
				"two",
				"up",
				"use",
				"very",
				"want",
				"way",
				"we",
				"well",
				"what",
				"when",
				"which",
				"who",
				"will",
				"with",
				"would",
				"year",
				"you",
				"your"};
		char chars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int counts[] = new int[26];
		boolean b;
		// Calculating the frequency of each letter
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				String lul = Character.toString(chars[i]);
				b = arr[j].contains(lul);
				if (b == true)
					counts[i] += 1;
			}
		}
		// Calculating the highest and lowest frequency letters
		int lowest = 0, highest = 0;
		for (int i = 0; i < counts.length - 1; i++) {
			if (counts[i + 1] > counts[i])
				highest = i + 1;
			if (counts[i + 1] < counts[i])
				lowest = i;
		}
		// Printing frequency of all
		for (int i = 0; i < counts.length; i++)
			System.out.println(counts[i]);
		// Calculating percentage compositing of
	}
}
