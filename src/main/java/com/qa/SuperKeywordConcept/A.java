package com.qa.SuperKeywordConcept;
/*
SuperKeyword:It refers to the objects  of immediate parent class.
Need of super Keyword:Whenever dervived class is inherits the base class features,there is possibility that base
                      class features are similar to the dervived features and JVM gets ambiguity.Inorder to
                      differentiate between the base class and dervived class features must preceded by Super Keyword.
 Usage of SuperKeyword:
    To access the data members of parent class when both parent and child class have memebers with same name.
    To explicitly call the non-org and parameterized constructor  of parent class.
    To access the method of parent class when child class has overidden method.

  How to use Super Keyword to access the varaibles of parent class?
       When you have the varaible in child which is already present in the parent class then inorder to access the
       varaible of parent of parent class ,you need to use the super keyword.
 */

public class A {

    public String color="White";
}
