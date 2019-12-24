package com.qa.SerializationConcepts;

import java.io.Serializable;
//In the below example, Student class implements Serializable interface. Now its objects can be converted into stream.

public class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
