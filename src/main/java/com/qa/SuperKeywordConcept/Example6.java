package com.qa.SuperKeywordConcept;

public class Example6 extends Example5 {
    public void run(){
        System.out.println("run method from child class");
    }

    public void display(){
        run();
        super.run();
        test();
    }

    public static void main(String[] args) {
        Example6 obj=new Example6();
        obj.display();
    }
}
