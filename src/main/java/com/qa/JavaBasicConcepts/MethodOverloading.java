package com.qa.JavaBasicConcepts;

public class MethodOverloading {

    public static void main(String args[]){
        MethodOverloading obj=new MethodOverloading();
        obj.sum();
        obj.sum(10);
    }

    //Method overlaoding :method withsame with differnt types of arguments

    public void sum() {
        System.out.println("Sum method with Zero parameter");
    }


    public void sum(int i){
        System.out.println("Sum method with  one Paramter");
    }
}
