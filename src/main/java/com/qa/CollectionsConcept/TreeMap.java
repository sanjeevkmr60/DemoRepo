package com.qa.CollectionsConcept;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
    java.util.TreeMap<Integer, String> tm=new java.util.TreeMap<>();
        tm.put(10,"Test1");
        tm.put(11,"Test4");
        tm.put(12,"Test3");
        tm.put(13,"Test2");
        tm.put(14,"Test5");

        for (Map.Entry m:tm.entrySet()) {
            System.out.println(m.getKey());
            System.out.println(m.getValue());
            
        }
    }
}
