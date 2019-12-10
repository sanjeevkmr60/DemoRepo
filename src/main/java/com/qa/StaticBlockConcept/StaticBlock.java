package com.qa.StaticBlockConcept;
/*Static block:
   Used for intializing the static variables.
   This block gets executed when the class is loaded in the memory.
   A class can have mutiple static blocks,which will execute in the same sequence in which they
   have written into the program.

   Static block execution does not depends on the object creation.
 */

public class StaticBlock {
    static int num;
    static String str;
    static{
        num=97;
        str="Static keyword in Java";
    }

    public static void main(String[] args) {
        System.out.println("Value of num  :"+num);
        System.out.println("Value of str :"+str);
    }
}
