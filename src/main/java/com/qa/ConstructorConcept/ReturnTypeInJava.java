package com.qa.ConstructorConcept;
/*
  Type of return value must match the methods declared return type
  We cant return integer value from a method whose declaration type is void.

 */

public class ReturnTypeInJava {

  public void test1(){
  }
    public int test2(){
      return 2;
    }
    public double test3(){
        return 2.19;
    }
    public boolean test4(){
        return true;
    }
    public char test5(){
        return 'a';
    }
    public ReturnTypeInJava test7(){
        return new ReturnTypeInJava ();
    }
    public int[] test8(){
      return new int[7];
    }
    //In test1() method,when we try to return integer data we will get compile time error.Since method declaration
    // type is void.

    public static void main(String[] args) {
        ReturnTypeInJava obj=new ReturnTypeInJava ();

        //int a[]=new int[5]; we declare the array in this...
    }
}
