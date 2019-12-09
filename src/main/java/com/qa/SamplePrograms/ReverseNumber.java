package com.qa.SamplePrograms;

public class ReverseNumber {
    public static void isReverseNumber(int num){
        int r;
        int sum=0;
        while(num>0){
            r=num%10;
            sum=sum*10+r;
            num=num/10;
        }
            System.out.println("reverse  number = " + sum);

    }

    public static void isReverseString(String str){
        String rev="";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
            System.out.println("reverse string  = " + rev);

    }

    public static void checkReverse(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("reverse of String = " + reverse);

    }
    public static void main(String args[]){
        isReverseNumber(123);
        isReverseString("software");
        checkReverse("software");

    }
}
