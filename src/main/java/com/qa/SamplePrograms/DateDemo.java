package com.qa.SamplePrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String args[]){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + simpleDateFormat.format(date));

        System.out.println("****************************");
        // display time and date
        String str = String.format("Current Date/Time : %tc", date );
        System.out.printf(str);

        System.out.println("/n");
        System.out.println("****************************");
        // display time and date
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);

        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");

            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");

            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
