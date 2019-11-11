package com.qa.ExceptionHandlingConcepts;

public class ExceptionHandling {

    //Object is super class of all the Exceptions
    // Throwable --->Object
    public static void main(String args[]){
       //uncaugt exception
        /*int i=9/0;
        System.out.println(i);*/

        /*//caught Exception
        Thread.sleep(2000);*/

       //1.try-catch block
        try{
            int a=9/0;//this code will throw an Exception
        }catch(ArithmeticException e){
           e.printStackTrace();
            System.out.println(e.getMessage());

        }
       /* catch(Error e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
         //Throwable is  super class i.e exception handled by this
        catch(Throwable e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
*/

        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");

    }
}
