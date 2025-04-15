package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name");

        System.out.print("first name: ");
        String firstname = scanner.nextLine().trim();
        System.out.print("middle name: ");
        String middlename = scanner.nextLine().trim();
        System.out.print("last name: ");
        String lastname = scanner.nextLine().trim();
        System.out.print("suffix: ");
        String suffix = scanner.nextLine().trim();

        StringBuilder fullname = new StringBuilder();
        fullname.append(firstname);

        if (!middlename.isEmpty()) {fullname.append(" ").append(middlename);
        }
        fullname.append(" ").append(lastname);

        if (!suffix.isEmpty()) {fullname.append(",").append(suffix);
        }

        System.out.println("full name: " + fullname.toString());




    }




}
