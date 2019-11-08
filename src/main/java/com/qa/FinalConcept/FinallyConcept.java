package com.qa.FinalConcept;

public class FinallyConcept {

    //finally block always will be excuted whether the Expetions come or not

    public  static void  test1()
    {
        try{
            System.out.println("Inside the test1 method");
            throw new RuntimeException("test");
        }catch (Exception e){
            System.out.println("inside catch block");
        }
        finally {
            System.out.println("inside finally block");
        }
    }

    public static void  test2(){
        try{
            System.out.println("Inside the test1 method");
        }
        finally {
            System.out.println("inside finally block");
        }
    }

    public static void division()
    {
        int i=10;
        try {
            System.out.println("inside try  block");
            int k = i / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("inside the catch block");
            System.out.println("divide by Zero");
        }
        catch(NullPointerException e){
            System.out.println("inside the catch block");
            System.out.println("divide by Zero");
        }

        finally {
            System.out.println("excude the code even after the exception");
        }
    }

  //this tricky interview question:here expection is Arithemetic exption but in catch we provide Null pointer
    // Expection but finally block is always excceuted  and then Exception will thrown if we are excuting this method
    // we can seeit


    public static void division1()
    {
        int i=10;
        try {
            System.out.println("inside try  block");
            int k = i / 0;
        }
        catch(NullPointerException e){
            System.out.println("inside the catch block");
            System.out.println("divide by Zero");
        }

        finally {
            System.out.println("excude the code even after the exception");
        }
    }

    public static void main(String args[]){
        //test1();
        //test2();
        division();
    }
}
