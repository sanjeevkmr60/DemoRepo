package com.qa.CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

import com.qa.CollectionsConcept.Employee;
/*Array Properties:
  1.Duplicate values are allowed.
  2.Maintian insertion order.
  3.Not Synchronized.
  4.Allow Random access to fetch any element becuse the stored the values in index based.
 */

public class ArrayListConcept {

    public static <E> void main(String args[])
    {
        ArrayList ar=new ArrayList();
            ar.add(10);
            ar.add(20);
            ar.add(30);
        System.out.println(ar.size());
            ar.add(40);
            ar.add(50);
            ar.add(50);
        System.out.println(ar.size());
        System.out.println("get the value of 4th index is:"+ar.get(4));

        System.out.println("*********************************");

        //To print all the Values from ArrayList using For loop nd iterator
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        Iterator<Integer> it=ar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("*********************************");
        //non-generic(which defnes the values)Vs Generic  Ex.ar.add(10.3),ar.add("text"),ar.add('c'),ar.add(true)
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ar1.add(100);
        //ar1.add("Selenium");  it is not possibe it stores only Integers.

        ArrayList<String> ar2=new ArrayList<String>();
         ar2.add("Selenium");
        // ar2.add(100);;  it is not possibe it stores only Strings.


       /* ArrayList<E> ar3=new ArrayList<E>();
           ar3.add(10);
           ar3.add(Selenium);*/
        // ar2.add(100);;  it is not possibe it stores only Strings.


        System.out.println("*********************************");

        Employee e1=new Employee("Sanjeev",27,"QA");
        Employee e2=new Employee("Tom",27,"Dev");
        Employee e3=new Employee("Peter",27,"Admin");

        ArrayList<Employee> ar4=new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        //Iterator to traverse the values
        Iterator<Employee> it1=ar4.iterator();
        while(it1.hasNext()){
            //System.out.println(it.next()); //it will print in format com.qa.SamplePrograms.Employee@27716f4
            Employee emp=it1.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);

        }

        System.out.println("*********************************");
        //addAll()
        ArrayList<String> ar5=new ArrayList<String>();
        ar5.add("text");
        ar5.add("Selenum");
        ar5.add("QTP");
        ArrayList<String> ar6=new ArrayList<String>();
        ar6.add("DEV");
        ar6.add("JAN");
        ar6.add("JScript");
        ar5.addAll(ar6);
        System.out.println(ar5);

        //removeAll
        ar5.removeAll(ar6);
        System.out.println(ar5);

        //retainAll
        ar5.retainAll(ar6);
        System.out.println(ar5);

    }
}
