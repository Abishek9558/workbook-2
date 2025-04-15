package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the score in the format home:visitor|21:9: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\|");

        if (parts.length != 2) {
            System.out.println("invalid format");
            return;
        }
        String [] teams = parts[0].split(":");
        String [] scores = parts[1].split(":");

        if  (teams.length != 2 || scores.length !=2) {
            System.out.println("wrong.");
            return;
        }

        String hometeam = teams[0];
        String visitorteam = teams[1];

        int homeScore;
        int visitorscore;

        try {
            homeScore = Integer.parseInt(scores[0]);
            visitorscore = Integer.parseInt(scores[1]);
        } catch (NumberFormatException e) {
            System.out.println("invalid");
            return;
        }
        if (homeScore > visitorscore) {
            System.out.println("the winning team is: " + hometeam);
        } else if (visitorscore > homeScore) {
            System.out.println("the winning team is: " + visitorteam);
        }
        else {
            System.out.println("tie");
        }


    }

}
