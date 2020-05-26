package com.qa.SamplePrograms;

import java.util.Arrays;

//binary Search always should in sorted order.if there is no sorted order make it in sorted manner and use built methods

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};

        int key=5;
        int l=0;
        int h=a.length-1;
        boolean flag=false;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==key){
                flag=true;
                System.out.println ("Element found" );
                break;

            }
            if(a[m]<key){
                l=m+1;
            }
            if(a[m]>key){
                h=m-1;
            }
        }
        if(flag=false)
            System.out.println ("Element is not found" );

        //Second approach
        System.out.println (Arrays.binarySearch (a,7 ));
    }
}
