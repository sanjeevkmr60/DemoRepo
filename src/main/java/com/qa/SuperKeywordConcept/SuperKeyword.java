package com.qa.SuperKeywordConcept;

import com.qa.JavaBasicConcepts.A;

public class SuperKeyword extends A {

    public SuperKeyword(int i){
        //super();we cannot write 2 super methods
        super(i);//it will come super class constructor;
        System.out.println("child class constructor");
    }

    public SuperKeyword(){
        super();
        System.out.println("child class constructor");
    }


   public static void main(String args[]){
       SuperKeyword obj=new SuperKeyword();
       SuperKeyword obj1=new SuperKeyword(10);

   }
}


