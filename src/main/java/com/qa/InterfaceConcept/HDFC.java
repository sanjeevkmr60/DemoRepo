package com.qa.InterfaceConcept;

public class HDFC implements Bank {
    @Override
    public void rateOfInterest() {
        System.out.println( "Rate of interest in HDFC is 8%");
    }
}
