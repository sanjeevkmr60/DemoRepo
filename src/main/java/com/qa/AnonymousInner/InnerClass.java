package com.qa.AnonymousInner;
/*
Inner class can access private members of outer class.
Code is optimized and readable.
 */
public class InnerClass {
    private int a=90;

    //inner class
    class Test{
        void display(){
            System.out.println("value of a:"+a);
        }

        void display(int a){
            System.out.println("value of a: "+a);
        }
    }

    public static void main(String[] args) {
        //outer class
        InnerClass obj=new InnerClass();
        //inner class object accessing
        InnerClass.Test obj1=obj.new Test();
        obj1.display();
        obj1.display(5);

    }
}
