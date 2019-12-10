package com.qa.StaticBlockConcept;
/*
 Static block execution does not depends on the object creation.
 */

public class Staticblock_Execution {
    static {
        System.out.println("SBI");
    }
    static {
        System.out.println("HDFC");
    }
    static {
        System.out.println("ICICI");
    }

    public static void main(String[] args) {

    }
}
