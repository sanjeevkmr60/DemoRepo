package com.qa.InterfaceConcept;

public class SBI implements Bank {
    @Override
    public void rateOfInterest() {
        System.out.println( "Rate of interest in SBI is 7%");
    }
}
