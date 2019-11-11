package com.qa.ExceptionHandlingConcepts;

public class NullPointerException {
    int a=10;
    public static void main(String args[]){

        NullPointerException obj=new NullPointerException();
        obj=null;
        //System.out.println(obj);
        System.out.println(obj.a);
    }
}
