package com.pluralsight;

public class DiceRoller {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1, roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            } else if (sum == 4) {
                fourCounter++;
            } else if (sum == 6) {
                sixCounter++;
            } else if (sum == 7) {
                sevenCounter++;
            }
        }

        // Display the results
        System.out.println("\nSummary of rolls:");
        System.out.println("Number of times sum was 2: " + twoCounter);
        System.out.println("Number of times sum was 4: " + fourCounter);
        System.out.println("Number of times sum was 6: " + sixCounter);
        System.out.println("Number of times sum was 7: " + sevenCounter);
    }
}
