package com.qa.Sample;

public class PrimeNumber {
    public static boolean isPolidrome(int num){
        if(num<2)
            return false;

        for (int i=2;i<num;i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void getPrimenumbers(int num)
    {
        for(int i=2;i<=num;i++){
             if(isPolidrome(i))
                 System.out.println("Prime number is"+i);
        }
    }
     public static void main(String args[]){
       boolean b=isPolidrome(-1);
       if(b==true)
           System.out.println("prime number");
       else
           System.out.println("Not a prime number");

           getPrimenumbers(10);

   }

}
