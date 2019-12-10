package com.qa.ConstructorConcept;

public class ConstructorAndThisKeywordConcept {

    //class vars:instance varaibles
    String name;
    int age;

    public ConstructorAndThisKeywordConcept()//Default constructor
    {
        System.out.println("Default constructor");
    }

   /* public ConstructorAndThisKeywordConcept()// constructor with same number and different no.of argements should be called
    {
        System.out.println(" another Default constructor");
    }*/
   public ConstructorAndThisKeywordConcept(int i)//Default constructor
   {
       System.out.println("One parameter constructor");
       System.out.println(i);
   }

    public ConstructorAndThisKeywordConcept(int i, int j)//Default constructor
    {
        System.out.println("Two parameter constructor");
        System.out.println(i+"    "+j);
    }

    public ConstructorAndThisKeywordConcept(String name, int age){
      // public ConstructorAndThisKeywordConcept(String name1,int age1)
        this.name=name;//this.class variable =local variables
        this.age=age;
        /*name=name1; we can give like this ,in method we can use different variables
        age=age1;*/

    }

    public static void main(String args[]){
       //constructor can be overaloded.
        ConstructorAndThisKeywordConcept obj=new ConstructorAndThisKeywordConcept();
        ConstructorAndThisKeywordConcept obj1=new ConstructorAndThisKeywordConcept(10);
        ConstructorAndThisKeywordConcept obj2=new ConstructorAndThisKeywordConcept(10,20);
        ConstructorAndThisKeywordConcept obj3=new ConstructorAndThisKeywordConcept("Tom",25);
        System.out.println(obj3.name);
        System.out.println(obj3.age);


    }
}
