package com.qa.JavaBasicConcepts;

public class TypeCastingExample {
    public static void main(String[] args) {

        double d=300.09;
        long l= (long) d;
        int i= (int) l;
        short b= (short) i;

        System.out.println("Double value: "+d);
        System.out.println("Long value: "+l);
        System.out.println("Int value: "+i);
        System.out.println("Short value: "+b);

    }
}
