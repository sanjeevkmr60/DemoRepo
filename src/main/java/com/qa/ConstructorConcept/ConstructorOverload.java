package com.qa.ConstructorConcept;

public class ConstructorOverload {

    int i,j,k;

    public ConstructorOverload(){

    }
    public ConstructorOverload(int i, int j) {
     this.i=i;
     this.j=j;
        System.out.println(+i+"Values of :"+j);
    }

    public ConstructorOverload(int i, int j,int k) {
        this.i=i;
        this.j=j;
        this.k=k;
        System.out.println(+i+"Values of: "+j+"Values of: "+k);
    }
    public static void main(String[] args) {
        ConstructorOverload obj=new ConstructorOverload();
        ConstructorOverload obj1=new ConstructorOverload(2,8);
        ConstructorOverload obj2=new ConstructorOverload(2,3,4);
    }
}
