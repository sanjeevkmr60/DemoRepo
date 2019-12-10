package com.qa.SuperKeywordConcept;

public class C {
    int salary;
    int age;

    C(){

    }

    C(int salary, int age){
        this.age=age;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(final int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }


}
