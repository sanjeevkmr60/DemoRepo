package com.qa.SamplePrograms;

public class  FactorialNumber {
          /*  4! = 4*3*2*1 = 24
            5! = 5*4*3*2*1 = 120*/

    public static void isFactorialnumber(int number){
        int fact=1;
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    //with Recursive function:function call itself
    public static int fact(int num)
    {
        if(num==0)
            return 1;
        else
            return (num*fact(num-1));
    }


    public static void main(String args[]){
        isFactorialnumber(4);
        isFactorialnumber(5);
        int fact = fact(5);
        System.out.println("factorial of given number :"+fact);
    }
}
