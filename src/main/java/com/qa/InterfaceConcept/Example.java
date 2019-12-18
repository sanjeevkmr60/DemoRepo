package com.qa.InterfaceConcept;
/*
  1.Interface has only unimplemented methods
    ex:uncorrect
        void test(){ }
        correct:
        void test1();
  2.Interface members are by default (Public static final)
     ex: int j=90;
         public static final int i=90;
  3.We call inteface as 100% abstract class
  4.Multiple Inheritance is possible incase of interface
  5.One calss extend the other Interface
    Ex: public Interface A{}
        public Interface B{}
        public interface D extends A,B{}
  6.We cannot create object of interface,Since all members ar unimplemented.
  7.We cannot create constructor interface.Since the object creation for interface is not possible
     Ex:public interface A{
      A(){}  //we will get compile time Error .
     }
8. Class can implement the Interfaces.

 */

public interface Example {
    //below members are same
    int j=90;
    public static final int i=90;

     public  void test1();
     public void test2();
     public void test3();

}
