package com.qa.AnonymousInner;

//Defining a class with no idenitity
//Defination is always inside the method.
//it is one type of inner class
//We cannot define constructors in Anonymouus inner class

public class AnonymousInnerClass {
    public static void main(String args[]){
        A obj=new A() {
            @Override
            public void run() {
                System.out.println("Anonymous inner class Implementation");
            }
        };
        obj.run();
    }
}
