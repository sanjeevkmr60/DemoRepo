package com.qa.StaticAndNonStaticConcept;
/*
Static members of a class are accesed by ClassName,Since Static members are class members.
Non Static members of class are accesed by object.They are object members.

Static varaibles in Java:
  It is created by only one in the program at time of laoding the class.They are called by Static Keyword.
  They can access within class reference.

Non- Static varaibles in Java:
  It is created at time of creation of object of class.They are not called by  any Static Keyword.
  They can access within Object reference.
 */

public class Example1 {

    public int i=90;
    public static int j=80;

    public void test1()
    {
        System.out.println("Non-static method");
    }


    public static void test2(){
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Example1 obj=new Example1();
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(Example1.j);

        //wecan call non static members through class  name,it will through compile time error
        //System.out.println(Example1.i);

        Example1 obj1=new Example1();
        obj1.test1(); //non static memthods we need to create the object
        test2();//static method we need not create the object

    }

}
