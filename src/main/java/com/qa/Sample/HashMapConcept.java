package com.qa.Sample;

import java.util.HashMap;
import java.util.Map;

/*
1.HashMap implements Map interface
2.Extends AbstractMap
3.contains only unique elements
5.Stores the Values n Key-Pair
6.It may have one null key and multiple null values
7.it maintains no order
 */

public class HashMapConcept {

    public static void main(String args[])
    {
        HashMap<Integer,String>  hm=new HashMap<Integer, String>();
        hm.put(1,"Selenium");
        hm.put(2,"Qtp");
        hm.put(3,"Test");
        hm.put(4,"Automtion");

        System.out.println(hm.get(1));
        System.out.println(hm.get(4));

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getValue());
            System.out.println(m.getKey());
        }

        //remove
        hm.remove(4);
        System.out.println(hm);

        System.out.println("*********************************");

        Employee e1=new Employee("Sanjeev",27,"QA");
        Employee e2=new Employee("Tom",27,"Dev");
        Employee e3=new Employee("Peter",27,"Admin");

        HashMap<Integer,Employee>  em=new HashMap<Integer, Employee>();
        em.put(1,e1);
        em.put(2,e2);
        em.put(3,e3);

        //traverse the HasMap
        for(Map.Entry<Integer,Employee> entry:em.entrySet()){
            int key=entry.getKey();
            Employee e=entry.getValue();
            System.out.println(e.name  +"   "  +e.age+  "  "  +e.dept);


        }



    }
}
