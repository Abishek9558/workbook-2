package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your full name (first last or first middle last):");
        String input = scanner.nextLine().trim();

        String[] nameparts =input.split("\\s+");

        if (nameparts.length == 2) {
            String firstname =nameparts[0];
            String lastname = nameparts[1];

            System.out.println("first name:" + firstname);
            System.out.println("last name: " + lastname);}
        else if (nameparts.length == 3) {
            String firstname = nameparts[0];
                String middlename = nameparts[1];
                String lastname = nameparts[2];

                System.out.println("first name: " + firstname);
                System.out.println("middle naem: " + middlename);
                System.out.println("last name: " + lastname);

        }


    }






}
