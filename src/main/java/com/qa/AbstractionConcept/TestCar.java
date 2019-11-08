package com.qa.AbstractionConcept;

public class TestCar  {
    public static void man(String[] args){
        BMW b=new BMW();
        b.start();
        b.stop();
        b.reFuel();
        b.theftSafety();

        Car c=new BMW();
        c.start();
        c.stop();
        c.reFuel();
        //((BMW) c).theftSafety();

    }
}
