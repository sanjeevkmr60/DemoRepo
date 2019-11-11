package com.qa.InheritanceMethodOveridingAndDynamicPolymorphism;

public class Testcar {

    //When same method is present in parent and child class and same no.of arguments is called Method Overidding
    public static void main(String args[]){
        BMW b=new BMW();
        b.start();  //it always overides the parent class and child class o/p will get
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine();

        System.out.println("**************************");

        Car c=new Car();
        c.start();
        c.stop();
        c.refuel();
       // c.theftSafety(); we cannot inherit the child class methods.
        c.engine();


        System.out.println("**************************");
        Car c1=new BMW();//child class object can be refeered by parent class reference variable is called Dynamic
        // polmorphism.
        //common methods and overrideen methods can be called Dynamic polymorphism.
        //below is Top casting
        c1.start();
        c1.stop();
        c1.refuel();
       // ((BMW) c1).theftSafety();  we cannot inherit the child class methods.
        c.engine();


        //downCasting
        BMW b1= (BMW) new Car();
        b1.engine();
        b1.start();
        b1.stop();
        b1.theftSafety();
    }
}
