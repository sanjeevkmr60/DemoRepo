package com.qa.AnonymousInner;
/*
  Anonymous class:
      The class which has no name is called Anonymous class.
      This mainly used for intefaces and classes.
      Defining a class with no idenitity.
      Defination is always inside the method.
      It is one type of inner class.
      We cannot define constructors in Anonymous inner class.
 */
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
