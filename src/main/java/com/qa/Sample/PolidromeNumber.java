package com.qa.Sample;

public class PolidromeNumber {

    public static void isPolidromeNumber(int num){
        int r;
        int sum=0;
        int t=num;
        while(num>0){
           r=num%10;
           sum=sum*10+r;
           num=num/10;
        }
       if(t==sum)
           System.out.println("Polidrome number = " + t);
       else
           System.out.println("Not a Polidrome number = " + t);

    }

    public static void isPolidromeString(String str){
        String rev="";
        String temp=str;
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(temp.equals(rev))
            System.out.println("Polidrome  = " + temp);
        else
            System.out.println("Not a Polidrome = " + temp);
    }

    public static void checkPolidrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        // check whether the string is palindrome or not
        if (str.equals(reverse))
            System.out.println("Polidrome using string function "+str);

        else
            System.out.println("Not a Polidrome using string function "+str);
    }


    public static void main(String args[]){
        isPolidromeNumber(151);
        isPolidromeNumber(143);
        isPolidromeString("madam");
        isPolidromeString("Hello");
        checkPolidrome("malayalam");
        checkPolidrome("soft");
    }
}
