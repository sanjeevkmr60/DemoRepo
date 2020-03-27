package com.qa.ArraysConcept;

public class OneDimensionalArray {
    public static void main(String args[]) {
        // declaration and instantiation
        int a[] = new int[5];
        // initialization
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        // length is the property of array
        for (int i = 0; i < a.length; i++)
        System.out.println(a[i]);
    }
}
