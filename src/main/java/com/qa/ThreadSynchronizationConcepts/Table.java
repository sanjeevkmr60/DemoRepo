package com.qa.ThreadSynchronizationConcepts;

public class Table {
    //Here we added synchronized keyword,to know the difference bwtween with synchronization  and without.
    //just remove synchronized keyword and Run ,u will observe the difference .
    /*synchronization can defind in this way also.
    void printTable(int n){
   synchronized(this){//synchronized block
     for(int i=1;i<=5;i++){
      System.out.println(n*i);
      try{
       Thread.sleep(400);
      }catch(Exception e){System.out.println(e);}
     }
   }
}//end of the method
}
     */
    synchronized void printTable(int n){
        for(int i=1;i<=5;i++){
            System.out.println (n*i );
            try{
                Thread.sleep (400);
            }catch(Exception e){
                System.out.println (e );
            }
        }
    }
}
