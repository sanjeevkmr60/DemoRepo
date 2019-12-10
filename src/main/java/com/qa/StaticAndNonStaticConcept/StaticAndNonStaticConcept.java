package com.qa.StaticAndNonStaticConcept;

public class StaticAndNonStaticConcept {


    String name="Tom";//non-static global variable
    static int age=25;//static global variable

    public void sendMail(){
        System.out.println("send mail Method");
    }

    public static void sum(){
        System.out.println("Sum method");
    }


    public static void main(String args[])
    {
        //how to call static methods and variable
        //1.direct calling
        sum();
        //2.call by Classname
        StaticAndNonStaticConcept.sum();

        System.out.println(age);
        System.out.println(StaticAndNonStaticConcept.age);

        //how to call non-static methods and variable
        StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
         obj.sendMail();
        System.out.println(obj.name);


    }
}
