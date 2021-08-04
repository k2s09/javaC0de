// program to rate a movie based on user's opinion

import java.util.Scanner;

class Movie_Rating {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter movie title ");
        String title = sc.next();
        System.out.println(" Rate " + title + " out of 5");
        double rate = sc.nextDouble();
        if ((rate >= 0.0) && (rate <= 2.0))
            System.out.println(" The movie is a flop ");
        if ((rate >= 2.1) && (rate <= 3.4))
            System.out.println(" The movie is semi-hit ");
        if ((rate >= 3.5) && (rate <= 4.5))
            System.out.println(" The movie is a hit ");
        if (rate > 4.5)
            System.out.println(" The movie is a super - hit");
    }
}
    
       
    
