package com.qa.SamplePrograms;

public class RemoveJunkCharcters {

    public static void main(String args[])
    {
        String s="!@#$%^&*()LATINstring1223137874,....?\":{}|<>";
        String r="";
        r= s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Remove Junk data = " + r);

        r= s.replaceAll("[^0-9]","");
        System.out.println("Remove Junk data = " + r);

        r= s.replaceAll("[^a-z]","");
        System.out.println("Remove Junk data = " + r);

        r= s.replaceAll("[^A-Z]","");
        System.out.println("Remove Junk data = " + r);

        r= s.replaceAll("[^!@#$%^&*(),.?\":{}|<>]","");
        System.out.println("Remove Junk data = " + r);
    }
}
