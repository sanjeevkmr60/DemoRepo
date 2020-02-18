package com.qa.CovariantReturnType;
/*
Covariant Return Type:
The covariant return type specifies that the return type may vary in the same direction as the subclass.

As you can see in the above example, the return type of the get() method of A class is A but the return type of
the get() method of B class is B.
Both methods have different return type but it is method overriding. This is known as covariant return type.

How is Covariant return types implemented?
Java doesn't allow the return type based overloading but JVM always allows return type based overloading.
JVM uses full signature of a method for lookup/resolution. Full signature means it includes return type in addition to argument types. i.e., a class can have two or more
 methods differing only by return type. javac uses this fact to implement covariant return types.
 */

public class A {
    A get(){return this;}
}
