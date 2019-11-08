package com.qa.Sample;

public class SwapStrings {

    public static void main(String args[]){
        String a="Hello";
        String b="World";

        System.out.println("a value is before swap "+a);
        System.out.println("b value is before swap "+b);

        a=a+b;

        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("a value is after swap "+a);
        System.out.println("b value is after swap "+b);


    }
}
