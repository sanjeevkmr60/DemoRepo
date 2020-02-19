package com.qa.EncapsulationConcept;

public class EncapsulationEmpDataConcept {
    /*
    Encapsulation is also called Data hiding.
    How to implement Encapsulation?
      Private data variables
      Private data variables are not accessed directly from outside the class.

      Java Encapsulation:

Encapsulation is a mechanism where we collect code (methods) as a unit while working on data (variables) and data.
In java encapsulation, the variables of one class will be hidden from other sections, and can be accessed only
through the methods of their current class, therefore, this is also known as data hiding.
In order to achieve the encapsulation, we need to declare the variable of one class as
private and to provide a public setter and a getter method for modifying and viewing variable values.

To get encapsulation in Java:

Announce a class variable as a private.
Provide public setter and getter methods for modifying and viewing variable values.
It gives you control over the data.

    Advantages:
    1.Data hiding.
    2.Increased Flexibility:Based on our requirement, we can only read or write only the variables of the class.
    3.Resuabilitiy
    4.Testing code is easy.
     */

     private int ssn;
     private String empName;
     private int empAge;

    //getter and settet methods

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(final String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(final int empAge) {
        this.empAge = empAge;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(final int ssn) {
        this.ssn = ssn;
    }


    public static void main(String args[]){
        EncapsulationEmpDataConcept emp=new EncapsulationEmpDataConcept();
        emp.setSsn(12345);
        emp.setEmpName("Sanjeev");
        emp.setEmpAge(27);
        System.out.println("emp ssn  :"+emp.getSsn());
        System.out.println("emp empName  :"+emp.getEmpName());
        System.out.println("emp Age  :"+emp.getEmpAge());
    }
}
