package com.qa.AbstractionConcept;

public class BMW implements Car {
    @Override
    public void start() {
        System.out.println("BMW--Start");
    }

    @Override
    public void stop() {
        System.out.println("BMW--Stop");
    }

    @Override
    public void reFuel() {
        System.out.println("BMW--reFuel");
    }

    //non overidden methods
    public void theftSafety(){
        System.out.println("BMW-TheftSafety");

    }
}
