package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();

        System.out.println("what is the serial number? ");
        cellPhone.setSerialNumber(enter.nextInt());
        enter.nextLine();


        System.out.println("what is the model? ");
        cellPhone.setModel(enter.nextLine());

        System.out.println("what is the carrier? ");
        cellPhone.setCarrier(enter.nextLine());

        System.out.println("what is your phone number? ");
        cellPhone.setPhonenumber(enter.nextLine());

        System.out.println("who is the owner? ");
        cellPhone.setOwner((enter.nextLine()));


        System.out.println("serial Number: " + cellPhone.getSerialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("carrier: " + cellPhone.getCarrier());
        System.out.println("phone Number: " + cellPhone.getPhonenumber());
        System.out.println("owner: " + cellPhone.getOwner());


    }


}



