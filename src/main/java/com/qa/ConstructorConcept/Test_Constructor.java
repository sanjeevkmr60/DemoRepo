package com.qa.ConstructorConcept;
/*Constructor:
  In Java,constructor is similar to Method.It is called when we create object class.
  Constructor Name is same as class Name.
  Constructor does not has Return type.
  When we don't create constructor in class,Java compiler will keep by default constructor.
  Types of Constructors:
   1.Default(No arguments):It will not have any arguments.
   2.Parameterized:It will have arguments

Use of constructor:
   It is used to initialize the object of a class
   Default constructor is used to provide th default values to the object like 0,null etc..depending on the type.
   Parameterized Constructor is used to provide different values to the distinct objects.

Yes constructor overloading is possible.
 */

public class Test_Constructor {
    int a;
    int b;//these a,b are called instance variables/global/class variables

    public Test_Constructor(int a, int b)
    {
        this.a=a; //here a,b are local variables ,this.a,this.b are Class variables;
        this.b=b;
        System.out.println("Int a ,Int b");
    }
    //default constructor
    public Test_Constructor(){
        System.out.println("No arguments");
    }

    public static void main(String[] args) {
        Test_Constructor test=new Test_Constructor();
        Test_Constructor test1=new Test_Constructor(2,3);
    }
}
