package com.pluralsight;

import java.util.Arrays;

public class TestStastics {

    public static void main(String[] args) {
        int[] scores = {88, 76, 92, 85, 69, 94, 73, 81, 90, 77};

        double total = 0;
        int high = scores[0];
        int low = scores[0];

        
        for (int score : scores) {
            total += score;

            if (score > high) {
                high = score;
            }

            if (score < low) {
                low = score;
            }
        }

        double average = total / scores.length;


        Arrays.sort(scores);

        double median;
        if (scores.length % 2 == 0) {
            median = (scores[scores.length / 2 - 1] + scores[scores.length / 2]) / 2.0;
        } else {
            median = scores[scores.length / 2];
        }

        double difference = Math.abs(average - median);

        // Output statistics
        System.out.println("Test Scores: " + Arrays.toString(scores));
        System.out.println("Average score: " + average);
        System.out.println("High score: " + high);
        System.out.println("Low score: " + low);
        System.out.println("Median score: " + median);
        System.out.println("Difference between average and median: " + difference);

    }
}






