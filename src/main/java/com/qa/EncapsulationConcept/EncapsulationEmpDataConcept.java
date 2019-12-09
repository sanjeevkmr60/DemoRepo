package com.qa.EncapsulationConcept;

public class EncapsulationEmpDataConcept {
    //Encapsulation is also called datahiding
    //how to implement Encapsulation
    //private data varibles
    //private data varaibles are not accessed directly from outside the class
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
