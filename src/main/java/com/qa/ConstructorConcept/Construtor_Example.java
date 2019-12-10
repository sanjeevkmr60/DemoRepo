package com.qa.ConstructorConcept;

public class Construtor_Example {
    int i;
    int j;

 public Construtor_Example(int i, int j){
     this.i=i;
     this.j=j;

  }

    public static void main(String[] args) {
        Construtor_Example obj=new Construtor_Example(2,8);
        System.out.println(obj.i);
        System.out.println(obj.j);
    }
}
