// Finds how many blins you can make 
// Inspired by Boris

import java.util.Scanner;

public class Blinsmaker {
    public static void main(String args[]) {
        int eggs;
        int milk; // millilitre
        int flour; // grams
        int minEggs = 2;
        int minMilk = 200;
        int minFlour = 100;
        // Taking inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("How many eggs you have?");
        eggs = sc.nextInt();
        System.out.println("How much milk you have?");
        milk = sc.nextInt();
        System.out.println("How much flour you have?");
        flour = sc.nextInt();
        sc.close();
        // Calculating if there is enough for one meal
        if (eggs < minEggs || milk < minMilk || flour < minFlour)
            System.out.println("There is not enough for a single meal :("); // One meal is four blins
        else {
            int eggPortions = eggs / minEggs;
            int milkPortions = milk / minMilk;
            int flourPortions = flour / minFlour;
            int smallest = (eggPortions < milkPortions && eggPortions < flourPortions) ? eggPortions : (milkPortions < eggPortions && milkPortions < flourPortions) ? milkPortions : flourPortions;
            System.out.println("You can make " + smallest * 4 + " blins, or " + smallest + " portions");
            System.out.println("You need " + smallest * minEggs + " eggs and " + (eggs - (smallest * minEggs)) + " will not be used");
            System.out.println("You need " + smallest * minMilk + "ml milk and " + (milk - (smallest * minMilk)) + " will not be used");
            System.out.println("You need " + smallest * minFlour + "g flour and " + (flour - (smallest * minFlour)) + " will not be used");
        }
        System.out.println("Blinmaker shutting down...");
    }
}