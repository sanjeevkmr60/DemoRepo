package com.qa.SingleTonConcept;

public class  Singleton {
    /*
    In OOps,Singleton class is a class that can have only object(instance of the class) at a time
    How to design the Singleton class:
     1.make constructor as Private
     2.write a  public static method that has a return type of object of Singleton class (Lazy Intialization)
 */
    private static Singleton singleton_instance=null;
    public String str;

    private Singleton(){
        str="Hey am using the Singleton class Pattern";
    }

    public static Singleton getInstance(){
        if(singleton_instance==null)
            singleton_instance=new Singleton();
            return singleton_instance;
    }


    public static void main(String args[]){
       Singleton x= Singleton.getInstance();
        Singleton y= Singleton.getInstance();
        Singleton z= Singleton.getInstance();

        x.str= (x.str).toUpperCase();
        System.out.println( x.str);
        System.out.println( y.str);
        System.out.println( z.str);

        z.str=(z.str).toLowerCase();
        System.out.println( x.str);
        System.out.println( y.str);
        System.out.println( z.str);

    }
}
