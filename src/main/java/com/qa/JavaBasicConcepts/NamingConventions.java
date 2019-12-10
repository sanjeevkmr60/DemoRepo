package com.qa.JavaBasicConcepts;
/*
ClassName should start with Capital letters.
Method Name should start with Lower case letters.
Package Name should always be Lowercase.
Constant should be in Uppercase.
 */

public class NamingConventions {
    int age;
    static final int MAX_AGE=8;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
      this.age=age;
    }

    public static void main(String[] args) {
        NamingConventions nc=new NamingConventions();
        nc.setAge(27);
        System.out.println(nc.age);
        System.out.println(NamingConventions.MAX_AGE);

    }
}
