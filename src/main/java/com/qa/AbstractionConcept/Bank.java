package com.qa.AbstractionConcept;

public abstract class Bank {
    /*
    An abstract class can have both abstract and non-abstract methods.
    It can provide the implementation of the interface
    An abstract class can have protected and abstract public methods.
    An abstract class can have final, static, or static final variable with any access specifier.
    Partial Abstraction
    abstract method -no method body
    */
    //hiding the Implemtation logic-Abstraction
    int amt=100;
    final int rate=10;
    static int loanRate=5;

    public abstract void loan();  //abstract method -no method body

    public void credit(){
        System.out.println("Bank- Credit");
    }

    public void debit(){
        System.out.println("Bank- Debit");
    }
}
