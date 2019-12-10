package com.qa.JavaBasicConcepts;

public class TyepcastingIntDoubleToByte {
    public static void main(String[] args) {
        byte b;
        int i=259;
        double d =412.142;
        System.out.println("convert int to Byte");

        b=(byte)i;
        System.out.println("i="+i+"  b="+b);

        System.out.println("Convert double to byte");
        b=(byte)d;
        System.out.println("d="+d+"  b="+b);
    }
}
