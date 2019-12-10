package com.qa.SuperKeywordConcept;

public class D extends C {

    String name;
   /* int salary;   These are comming from parent class C
    int age;*/
    D(String name,int salary,int age){
        //super(); //this is calling from parent class C,First line constructor
        super(salary,age);
        this.name=name;
        /*this.salary=salary;    Inorder to call this method from parent ,we use super(salary,age)
        this.age=age;*/
    }

    void display()
    {
        System.out.println("name is: "+name+"  salary is :"+salary+" Age is :"+age);
    }

    public static void main(String[] args) {
        D d=new D("Sanjeev",2000,28);
        d.display();

    }
}
