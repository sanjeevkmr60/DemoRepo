package com.qa.AbstractionConcept;

public class TestBank {

    public static void main(String args[]){
        HDFCBank hb=new HDFCBank();
        hb.credit();
        hb.debit();
        hb.loan();
        hb.funds();


        //we can achieve Dynamic runtime polymorphism
        Bank b=new HDFCBank();
        b.loan();
        b.credit();
        b.debit();
        //b.funds();  we cannot get method


    }
}
