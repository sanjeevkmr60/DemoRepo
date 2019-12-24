package com.qa.SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersistTransient {
    public static void main(String args[]){
        try{
            //Creating the object
            StudentTransient s1 =new StudentTransient(211,"Kumar",22);
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
