// capitalizes every second character of a word

import java.util.Scanner;

public class memeConverter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence: ");
		String sentence = sc.nextLine();

		sentence = sentence.trim().toLowerCase().concat(" ");
		String word = "", solution = "";
		char ch, wh;
		int count = 0;

		for (int i = 0; i < sentence.length(); i++) {
			ch = sentence.charAt(i);
			if (ch != ' ')
				word += ch;
			else {
				for (int j = 0; j < word.length(); j++) {
					wh = word.charAt(j);
					if ((j + 1) % 2 != 0)
						solution += wh;
					if ((j + 1) % 2 == 0)
						solution += (char) (wh - 32);
				}
				solution += ' ';
				word = "";
			}
		}

		System.out.println(solution);
	}
}          
  
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
        
        
    