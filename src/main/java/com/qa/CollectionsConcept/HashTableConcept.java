package com.qa.CollectionsConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
    public static void main(String args[])
    {
        Hashtable h1=new Hashtable();
        h1.put(1,"Tom");
        h1.put(2,"Test_Constructor");
        h1.put(3,"Java");

        System.out.println(h1);

        //create a clone copy//shallow copy
        Hashtable h2=new Hashtable();
        h2= (Hashtable) h1.clone();
        System.out.println(h1);
        System.out.println(h2);

        //clear
        h1.clear();
        System.out.println(h1);
        System.out.println(h2);

        //contains value
        Hashtable st=new Hashtable();
        st.put("A","Sanjeev");
        st.put("B","Manager");
        st.put("C","Selenium");
        if(st.containsValue("Sanjeev"))
            System.out.println("Value is found");

        System.out.println("************************************");
        //We can iterate hashtable values usng Enumarator
        Enumeration e=st.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("************************************");
        //get all the values from hastable using Enntryset

        Set s=st.entrySet();
        System.out.println(s);
        System.out.println("************************************");

        Hashtable st1=new Hashtable();  //never define null values and Keys
        st1.put("A","Sanjeev");
        st1.put("B","Manager");
        st1.put("C","Selenium");

        //check both hashatble are Equals
        if(st.equals(st1))
            System.out.println("Both are Equal");
        System.out.println("************************************");
        //get the values form the Key
        System.out.println(st1.get("A"));

        System.out.println("************************************");
        //get HashCode of Hashtable
        System.out.println(st1.hashCode());
    }
}
