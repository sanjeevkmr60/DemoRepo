package com.qa.SamplePrograms;

import java.util.Arrays;

public class CheckArraysEqual {
    public static void main(String[] args) {
        int a[]={1,2,10,4,5};
        int b[]={1,2,3,4,5};

        boolean status= Arrays.equals (a,b);
        if(status==true)
        {
            System.out.println ("Arrays are Equal" );
        }
        else{
            System.out.println ("Arrays are Not Equal" );
        }
    }
}
