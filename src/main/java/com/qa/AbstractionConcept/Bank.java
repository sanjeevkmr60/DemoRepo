package com.qa.AbstractionConcept;

public abstract class Bank {

    //partial Abstraction
    //hiding the Implemtation logic-Abstraction
    //Abs class have abstract method and non abstract methods

    int amt=100;
    final int rate=10;
    static int loanRate=5;

    public abstract void loan();  //abstract method -no mwthod body

    public void credit(){
        System.out.println("Bank- Credit");
    }

    public void debit(){
        System.out.println("Bank- Debit");
    }
}
