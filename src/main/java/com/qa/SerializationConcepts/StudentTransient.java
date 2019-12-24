package com.qa.SerializationConcepts;
/*
Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.

Let's take an example, I have declared a class as Student, it has three data members id, name and age.
If you serialize the object, all the values will be serialized but I don't want to serialize one value, e.g. age then
we can declare the age data member as transient.

Example of Java Transient Keyword
In this example, we have created the two classes Student and PersistExample.
The age data member of the Student class is declared as transient, its value will not be serialized.
If you deserialize the object, you will get the default value for transient variable.
 */

import java.io.Serializable;

public class StudentTransient implements Serializable {
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public StudentTransient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

}
