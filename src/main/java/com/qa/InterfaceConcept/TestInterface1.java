package com.qa.InterfaceConcept;

public class TestInterface1 {

    public static void main(String[] args) {

        Bank bank=new HDFC();
        bank.rateOfInterest();

        Bank bank1=new SBI();
        bank1.rateOfInterest();


    }
}
