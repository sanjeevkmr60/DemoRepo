package com.qa.JavaConcepts;

public class ArrayConcept {

    public static void main(String args[])
    {
        //array can store similar data type values in the array.
        //1.int array
        //lowest bound/index =0
        //upper bound/index=n-1(n is the size of the array
       // Disadvantages
        //1.Size is fixed, this called static array.--Toovercome this we go for collections-ArrayList,
        // Hashtable-->Dynamic Array
        //2.Store only similar datatype--to  overcome this probelm we go for object Array.

        int i[]=new int[4];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;

        System.out.println(i[2]);
        System.out.println(i[3]);
        //System.out.println(i[4]);  //we will get Exception as Array index out of bound.

        System.out.println(i.length); //it will size of the Array

        // to print the all the values
        for(int j=0;j<i.length;j++){
            System.out.println(i[j]);
        }

        //doubleArray
        double d[]=new double[3];
        d[0]=12.33;
        d[1]=13.44;
        d[2]=45.55;
        System.out.println(d[2]);

        //characterArray
        char c[]=new char[3];
        c[0]='a';
        c[1]='2';
        c[2]='4';
        System.out.println(c[2]);

        //boolean array
        boolean b[]=new boolean[2];
        b[0]=true;
        b[1]=false;
        System.out.println(b[0]);

        //String Array
        String s[]=new String[2];
        s[0]="Hello";
        s[1]="World";
        System.out.println(s[1]);


        //object Array-it is used to store differnt data types of data
        //object is class
        Object ob[]=new Object[6];
        ob[0]="Tom";
        ob[1]=12;
        ob[2]=12.456;
        ob[3]=1/2/2040;
        ob[4]='M';
        ob[5]="London";

        System.out.println(ob[5]);
        System.out.println(ob.length);


    }
}
