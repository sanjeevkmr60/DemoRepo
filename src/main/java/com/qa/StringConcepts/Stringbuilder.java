package com.qa.StringConcepts;
/*
StringBuilder class is same as String Buffer class except that it is not synchronized.
****************************************************************************
       String                                 String Buffer
   1.immutable                                mutable
   2.String is slow and consumes more         it is fast and consumes less memory
     memory when you concat too many           when you concat Strings
     strings beacuse every time it caretes
     new instance
   3.String class overides the equals method    StringBuffer class  deosn't overides the equals method
     object class.so we can compare the cotents    of object class
     two strings by equals method

     *******************************************************************
     StringBuffer                                 StringBuilder
     1.Synchronized i.e thread safe.it           Non-Synchronized i.e not thread safe
     means two thread can't call the methods      it  means two thread call the methods of
     of stringbuffer Simultaneously               stringbuilder Simultaneously
     2.it is less efficient than StringBuilder    it is more  efficient than StringBuffer
 */
public class Stringbuilder {

public static void main(String args[]){
    StringBuffer sb=new StringBuffer();
    StringBuilder sd=new StringBuilder();
    sb.append("Test");
    sd.append("Test");

    System.out.println(sb);
    System.out.println(sd);

    sd.reverse();
    System.out.println(sd);

    sd.insert(1,"abc");
    System.out.println(sd);

    sd.replace(1,3,"start");
    System.out.println(sd);

    sd.capacity();
    System.out.println(sd.capacity());

    sd.ensureCapacity(30);
    System.out.println(sd.capacity());
}


}
