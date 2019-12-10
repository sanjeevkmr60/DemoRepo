package com.qa.SuperKeywordConcept;

public class B extends A {
    public String color="Black";

    void dislay(){
        System.out.println( "color from Child class:  "+color);
        System.out.println("color from the parent class:  "+super.color);
    }

    public static void main(String[] args) {
        B b=new B();
        b.dislay();
    }
    //just comment public String color="Black"; and run the pgm,JVM will access the parent class varaibles.
}
