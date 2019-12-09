package com.qa.StringConcepts;

public class Performance_StringBuffer_StringBulder {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            sb.append("sanjeev");
        }
        System.out.println("Time taken the String Buffer:" + (System.currentTimeMillis() - startTime) + "ms");


        StringBuilder sd = new StringBuilder();

        long startTime1 = System.currentTimeMillis();

        for (int j = 0; j < 100000; j++) {
            sd.append("sanjeev");
        }
        System.out.println("Time taken the String Builder:" + (System.currentTimeMillis() - startTime1) + "ms");
    }
}





