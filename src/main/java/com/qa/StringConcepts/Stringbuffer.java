package com.qa.StringConcepts;

/*
   String Buffer is usd to create mutable string,which means to modify the String once it is created.
   The String Buffer class in java is same as String class except is mutable i.e it can be changed.

   Constructor of string Buffer:
    StringBuffer->create an empty String buffer with an intial capacity of 16
    StringBuffer(String str)->creates String buffer with the Specfied String.
    StringBuffer(int capacity)->create an empty String buffer with an Specified capacity as length.
 */
public class Stringbuffer {

    public static void main(String args[]){
        String s1="Test_Constructor";
        //trying to change the String
        s1.concat("htext");
        //Since String is immutable,so we can't change the String
        //here we get Test_Constructor
        System.out.println(s1);

        //Creating  object of String Buffer
        StringBuffer sb=new StringBuffer("abc");


        //StringBuffer has append the method and it is immutable.
        sb.append("test");
        //here we get abctest
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer("abc  ");
        sb1.append("8899");
        //here we get abc  8899
        System.out.println(sb1);

       sb1.insert(1,"900");
       //here we get a900bc  8899
        System.out.println(sb1);

        sb1.replace(1,3,"800");
        //here we get a8000bc  8899
        System.out.println(sb1);

        sb1.delete(0,3);
        //here we get 00bc  8899
        System.out.println(sb1);

        sb1.reverse();
        //here we get 9988  cb00
        System.out.println(sb1);

        StringBuffer strBuffer =new StringBuffer();
        //here we get capacity is 16
        //here above 16 chars,it will calaculate 16*2=34
        //here we have above 34, it will calculate 34*2+2=70
        System.out.println("Capacity with empty   -->"+strBuffer.capacity());
        strBuffer.append("test");
        System.out.println("Capacity    -->"+strBuffer.capacity());
        strBuffer.append("testtesttestteste");
        System.out.println("Capacity    -->"+strBuffer.capacity());
        strBuffer.append("testtesttesttestetesttesttestteste");
        System.out.println("Capacity    -->"+strBuffer.capacity());


        StringBuffer strBuffer1 =new StringBuffer();
        System.out.println("Capacity    -->"+strBuffer1.capacity());
        strBuffer1.append("test");
        strBuffer1.ensureCapacity(5);
        System.out.println("Capacity    -->"+strBuffer1.capacity());

        strBuffer1.ensureCapacity(36);
        System.out.println("Capacity    -->"+strBuffer1.capacity());

        strBuffer1.ensureCapacity(50);
        System.out.println("Capacity    -->"+strBuffer1.capacity());

        strBuffer1.ensureCapacity(78);
        System.out.println("Capacity    -->"+strBuffer1.capacity());

        strBuffer1.ensureCapacity(80);
        System.out.println("Capacity    -->"+strBuffer1.capacity());



    }

}
