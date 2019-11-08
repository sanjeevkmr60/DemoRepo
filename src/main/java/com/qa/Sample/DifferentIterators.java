package com.qa.Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DifferentIterators {
    public static void main(String args[])
    {
        ArrayList<String> tvSeries=new ArrayList<String>();
        tvSeries.add("Samsung");
        tvSeries.add("LG");
        tvSeries.add("Videocon");
        tvSeries.add("Philips");
        System.out.println("**************foreach loop and lambdexpression*********************");
        //Using foreach loop and lambdexpression

        tvSeries.forEach(show->System.out.println(show));
        System.out.println("****************iterator*******************");
      //using iterator
        Iterator<String> it=tvSeries.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("**************for each remaining method*********************");
        //using Iterator with lamda Expression for each remaining method
        it=tvSeries.iterator();
        it.forEachRemaining(shows -> {
            System.out.println(shows);
        });

        System.out.println("***********for loop************************");
        //using for loop
        for(int i=0;i<tvSeries.size();i++)
        {
            System.out.println(tvSeries.get(i));
        }
        System.out.println("****************advance for loop*******************");
        //advance for loop
        for(String shows:tvSeries)
        {
            System.out.println(shows);
        }
        System.out.println("*************ListIterator**********************");
        //usng ListIterator
        ListIterator<String> tvSeriesList=tvSeries.listIterator(tvSeries.size());
        System.out.println("*****************PreviousElements******************");
        while(tvSeriesList.hasPrevious())
        {
            String show=tvSeriesList.previous();
            System.out.println("show = " + show);
        }

        System.out.println("****************NextElements*******************");
        while(tvSeriesList.hasNext())
        {
            String show=tvSeriesList.next();
            System.out.println("show = " + show);
        }
    }
}
