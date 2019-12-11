package com.qa.CollectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Test1");
        arr.add("Test3");
        arr.add("Test2");
        arr.add("Test5");
        arr.add("Test4");

        Collections.sort(arr);
        Iterator it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
