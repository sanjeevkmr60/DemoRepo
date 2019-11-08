package com.qa.StringConcepts;

public class StringImmutable {

/*1.String pool in method area
  2.Security
  3.Class Loading mechanism
  4.Optimization & Performance
  5.Integer,Long,Double,Float-Wrapper classes-Immutable and final
    */

//First put dubug point on s1,s2 datatype,same id is referring to one objects,next if we are assigning s2 value again
// it refers to unquie id again---This why Strings are immutable in nature i.e the values are modfied

public static void main(String args[])
{
    String s1="Java";
    String s2="Java";
    s2="Sanjeev";
    String s3="C++";

    System.out.println(s1);
    System.out.println(s2);
}
}
