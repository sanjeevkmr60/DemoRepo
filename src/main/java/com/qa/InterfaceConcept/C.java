package com.qa.InterfaceConcept;

public class C implements A,B {
    @Override
    public void test1() {
        System.out.println(" from interface A");
    }

    @Override
    public void test2() {
        System.out.println(" from interface B");
    }

    public static void main(String[] args) {
        C obj=new C();
        obj.test1();
        obj.test1();
    }
}
