package com.qa.ThisKeywordConcept;
/*
Java this Keyword:

this is a keyword in Java and is used as a reference variable which refers to the current object.
It can be used within the law or the constructor of class.
Works as a reference to the current object whose method or constructor is being used.
Java this keyword can be used to reference any member of the existing object from within an example method or constructor.
*/

public class This_Java {
int id;
String name;

This_Java(int id, String name) {
this.id = id;
this.name = name;
}

 void show() {
 System.out.println(id + " " + name);
 }

 public static void main(String args[]) {

 This_Java e1 = new This_Java(111, "Sanjeev");
 This_Java e2 = new This_Java(112, "Kumar");

 e1.show();
 e2.show();
 }
}
