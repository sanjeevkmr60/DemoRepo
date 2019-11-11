package com.qa.ExceptionHandlingConcepts;

public class ThrowsKeyword  {
    //Throw keyword is used in method chaining
    //Throw an Exception Hireachary
    // div()-->Sum()-->main()---->JVM(it will  call main method,it throw an Exception

    public static void main(String args[]) throws ArithmeticException{
        ThrowsKeyword obj=new ThrowsKeyword();
        obj.sum();
        System.out.println("ABC");
    }

    public void sum() throws ArithmeticException{
      div();
    }

    public void div() throws ArithmeticException{
       int i=9/0;//exception line
    }
}
