package com.qa.FinalConcept;
/*
finalize() is called by the garbage collector on an object when garbage collection determines that there are no more references
 to the object. A subclass overrides the finalize method to dispose of system resources or to perform other cleanup. ...
 */

public class FinalizeConcept {


    public static void main(String args[]) {
        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();
        f1 = null;
        f2 = null;
        System.gc();
    }

    public void finalize() {
        System.out.println("Finalize method");
    }
}

