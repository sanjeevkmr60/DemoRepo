package com.qa.JavaBasicConcepts;

public class WrapperClassConcept {
    public static void main(String args[])
    {
        String x="100";
        System.out.println(x+20);

        //dtata coversion:String to Int
        int i=Integer.parseInt(x);
        System.out.println(i+20);

        //Integer,Double,Boolean
        //Character wrapper class is not present.

        //String to double conversion
        String y="12.33";
        double d=Double.parseDouble(y);
        System.out.println(d+10);

        //String to boolean
        String k="true";
        boolean b=Boolean.parseBoolean(k);
        System.out.println(b);

        //int to String
        int j=200;
        System.out.println(j+20);

        String s=String.valueOf(j);
        System.out.println(s+20);


        String u="100A";
        int i1 = Integer.parseInt(u);
        System.out.println(i1);  //Number Format Exception ---For input String 100A,we should give pure String



    }
}
