package com.qa.StringConcepts;

import java.sql.SQLOutput;

public class StringManipulation {
    public static void main(String args[])
    {
        String str="The rain has started";
        String str1="The rain has started";
        System.out.println("********************************");
        System.out.println(str.length());
        System.out.println("********************************");
        System.out.println(str.toLowerCase());
        System.out.println("********************************");
        System.out.println(str.toUpperCase());
        System.out.println("********************************");
        System.out.println(str.charAt(5));
        System.out.println("********************************");
        System.out.println(str.indexOf('s'));
        System.out.println("********************************");
        System.out.println(str.indexOf('s',9));
        System.out.println("********************************");
        System.out.println(str.indexOf('s',str.indexOf('s')+1));
        System.out.println("********************************");
        System.out.println(str.indexOf("has"));
        System.out.println("********************************");
        System.out.println(str.equals(str1));
        System.out.println("********************************");
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println("********************************");
        System.out.println(str.substring(0,9));
        System.out.println("********************************");
        String s="   Hello world  ";
        System.out.println(s.trim());
        System.out.println(s.replaceAll(" ",""));
        String date="10/11/2017";
        System.out.println(date.replace("/","-"));

        System.out.println("********************************");
        String test="Hello world Test Selenium";
        String[] split = test.split("");
        for(String st:split)
        System.out.println(st);


        System.out.println("********************************");
        String s2="cares";
        System.out.println(s2.concat(s));

        System.out.println("************+perator");
        String x="Hello";
        String y="World";
        int a=100;
        int b=200;
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));



    }
}
