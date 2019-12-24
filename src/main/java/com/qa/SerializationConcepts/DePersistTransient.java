package com.qa.SerializationConcepts;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersistTransient {
    public static void main(String args[]){
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream (new FileInputStream ("f.txt"));
            /* Student s=(Student)in.readObject(); */
            StudentTransient s= (StudentTransient) in.readObject ();
            //printing the data of the serialized object
            //System.out.println(s.id+" "+s.name);
            System.out.println(s.id+" "+s.name+" "+s.age);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
