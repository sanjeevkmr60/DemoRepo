package com.qa.AnonymousInner;
/*
   The class which is present with in block or method is called LocalInner class
 */


public class LocalInnerClass {

    void display(){
        class Test{
            void sum(){
                System.out.println("sum of two members");
            }
        }
        Test obj=new Test();
        obj.sum();
    }

    public static void main(String[] args) {
        LocalInnerClass obj=new LocalInnerClass();
        obj.display();
    }
}
