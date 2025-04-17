package com.pluralsight;

public class CellPhone {
        private int serialNumber;
        private String model;
        private String carrier;
        private String phonenumber;
        private String owner;


        public CellPhone (){
            this.serialNumber = 0 ;
            this.model = "" ;
            this.carrier = "" ;
            this.phonenumber = "" ;
            this .owner = "" ;
        }
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
        }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    }









