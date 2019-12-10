package com.qa.instanceOfOperator;

public class B extends A {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj instanceof A);//o/p:true
    }
}
