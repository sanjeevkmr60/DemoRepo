package com.qa.JavaConcepts;

public class CallByValAndCallByRef {
    int p,q;
    public static void main(String args[])
    {
        CallByValAndCallByRef obj=new CallByValAndCallByRef();
        int x=10;int y=20;
        obj.testSum(x,y);//Call by Value or Pass by value
        System.out.println(obj.testSum(x,y));

        obj.p=50;
        obj.q=60;

        obj.swap(obj);//Call by reference or Pass by reference
        System.out.println(obj.p);
        System.out.println(obj.q);

    }
    //Call by Value
    public int testSum(int a,int b){
          a=30;
          b=40;
          int c=a+b;
          return c;
    }

    //Call by reference
    public void swap(CallByValAndCallByRef t){
     int temp;
     temp=t.p;
     t.p=t.q;
     t.q=temp;

    }
}
