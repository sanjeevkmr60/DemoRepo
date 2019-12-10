package com.qa.instanceOfOperator;
/*
Test1:This used to test whether the object is an instance of class,subclass or Interface
 */

public class Test1 {
    public static void main(String[] args) {
        Test1 iop=new Test1();
        System.out.println(iop instanceof Test1);//o/p:true
    }
}
