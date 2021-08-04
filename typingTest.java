import java.util.Scanner;

public class typingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String database = "I remember how you said that sometimes it gets just a little hard being home. There's sand stuck in my bed and memories in my head, love, I've been trying to let this whole thing go.";
        System.out.println("Get ready to type in 3");
        try {
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Start!");
        System.out.println("I remember how you said that sometimes it gets just a little hard being home.");
        long beforeTime = System.currentTimeMillis();
        String s1 = sc.nextLine();
        System.out.println("There's sand stuck in my bed and memories in my head, love, I've been trying to let this whole thing go.");
        String s2 = sc.nextLine();
        long afterTime = System.currentTimeMillis();
        sc.close();
        String sentence = s1.trim().concat(" ") + s2.trim();
        // Finding number of correct characters
        int correctChars = 0;
        for (int i = 0; i < database.length() && i < sentence.length(); i++) {
            if (database.charAt(i) == sentence.charAt(i))
                correctChars += 1;
        }
        // Finding number of correct words (1 word is 5 chars)
        int correctWords = correctChars / 5;
        // Finding time taken in minutes
        double timeTaken = (afterTime - beforeTime) / 60000.0;
        // Finding wpm and gross wpm (words per minute) and accuracy
        double wpm = correctWords / timeTaken;
        double accuracy = (correctChars / (database.length())) * 100.0;
        // Printing answers
        System.out.println("Your wpm: " + wpm);
        System.out.println("Your accuracy: " + accuracy);
    }
}
