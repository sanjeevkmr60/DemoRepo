package com.qa.CollectionsConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("QTP");
        ll.add("SELENIUM");
        ll.add("RFT");
        ll.add("RPA");
        System.out.println(ll);

        //addFirst
        ll.addFirst("SANJEEV");
        System.out.println(ll);
        //addLast
        ll.addLast("TOM");
        System.out.println(ll);
        //remove First and LastElements
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        //remove any Element
        ll.remove(2);
        System.out.println(ll);

        System.out.println("********************");
        //how to print all the values Using For/Iterator/advanceForLoop/While
        //for loop
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        System.out.println("********************");
        //Iterator
        Iterator<String> it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("********************");
        //AdvancedForLoop
        for(String str:ll){
            System.out.println(str);
        }

        System.out.println("********************");
        //while
        int num=0;
        while(num>ll.size()){
            System.out.println(ll.get(num));
            num++;
        }



    }
}
