package com.qa.SamplePrograms;

public class ReverseTwoStrings {
    public static String isReverse(String str){
       String rev="";
        for(int i=str.length ()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void isSwap(String a,String b){

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("a value is after swap "+a);
        System.out.println("b value is after swap "+b);
    }

    public static void main(String[] args) {

       String str1= isReverse("Sanjeev");
       String str2=isReverse ("Interview");
        isSwap (str1,str2);

        String rev1 = new StringBuffer("Software").reverse().toString();
        String rev2=new StringBuffer("Testing").reverse ().toString ();
        isSwap (rev1,rev2);

    }
}
