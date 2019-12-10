package com.qa.JavaBasicConcepts;
/*
You can add fields to a Java Enum.Thus,each constant enum vaule gets these fields.The
Field values must supplied to constructor of the enum defining the constants.
 */

public class Constant_EnumField {
    enum Season{WINTER(5),SPRING(10),SUMMER(15),FALL(20);
         private int value;
       private Season( int value) {
           this.value=value;
        }
        public static void main(String[] args) {
            System.out.println(Season.WINTER.value);
            for(Season s:Season.values()){
                System.out.println(s.value);
            }
        }

    }
}
