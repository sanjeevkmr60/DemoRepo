package com.qa.SamplePrograms;

public class SwapNumbers {

    public static void swapNumbers(int a,int b){
        int temp;
        System.out.println(" Before Swapping of numbers without using third var ,a value:  = " + a);
        System.out.println(" Before Swapping of numbers without using third var ,b value:  = " + b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(" After Swapping of numbers without using third var ,a value: = " + a);
        System.out.println(" After Swapping of numbers without using third var,b value: = "+b);
    }

    public static void isSwapNumber(int a,int b)
    {
        System.out.println("a value is before swap "+a);
        System.out.println("b value is before swap "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value is after swap "+a);
        System.out.println("b value is after swap "+b);
    }

    public static void isSwapByMutiply( int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a value is after swap "+a);
        System.out.println("b value is after swap "+b);
    }

    public static void bitwiseSwap(int x,int y){
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("a value is after swap "+x);
        System.out.println("b value is after swap "+y);
    }


    public static void main(String args[]){
        swapNumbers(10,20);
        isSwapNumber(10,20);
        isSwapByMutiply(10,20);
        bitwiseSwap(5,10);
    }
}
