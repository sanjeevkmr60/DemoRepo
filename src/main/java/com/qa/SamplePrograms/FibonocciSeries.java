package com.qa.SamplePrograms;

public class FibonocciSeries {

    public static void isFibonacciseries(int count){
        int a = 0, b = 1, c, i;
        System.out.print(a + " " + b);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    //using Recursive function

    public static int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2)
        {
            return 1;
        }
        if(n==0)
            return 0;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String args[]) {
      isFibonacciseries(10);
        System.out.println("");
      int fib=getFibonacci(0);
        System.out.println(fib);
    }
}