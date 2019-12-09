package com.qa.InterfaceConcept;

public class E implements D {
    @Override
    public void test3() {
        System.out.println("From Interface D");
    }

    @Override
    public void test1() {
        System.out.println("From Interface A");
    }

    @Override
    public void test2() {
        System.out.println("From Interface B");
    }

    public static void main(String[] args) {
        E obj=new E();
        obj.test1();
        obj.test2();
        obj.test3();

        A obj1=new E();
        obj1.test1();
        //obj1.test2();
        //obj1.test3();

        D obj2=new E();
        obj2.test1();
        obj2.test2();
        obj2.test3();

        //With this we can achieve interface concept

    }
}
