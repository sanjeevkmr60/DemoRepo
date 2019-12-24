package com.qa.SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
  In this example, we are going to serialize the object of Student class.
  The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object.
  We are saving the state of the object in the file named f.txt.
 */

public class Persist {

    public static void main(String args[]){
        try{
            //Creating the object
            Student s1 =new Student(211,"Sanjeev");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream ("f.txt");
            ObjectOutputStream out=new ObjectOutputStream (fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }
}
