package com.qa.SamplePrograms;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
       /* int[] a={1,3,5};
        int[] b={1,3,5,7};*/
       String[] a={"apple","cat","Dog"};
        String[] b={"apple","cat","Dog"};

        if(Arrays.equals (a,b)){
            System.out.println (" Both Arrays are Equal" );
        }
        else
            System.out.println ("Both Arrays are not Equal" );

    }
}
