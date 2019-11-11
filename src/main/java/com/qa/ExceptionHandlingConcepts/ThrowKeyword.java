package com.qa.ExceptionHandlingConcepts;

public class ThrowKeyword {

    public static void main(String args[]){
        System.out.println("ABC");
        try {
            throw new Exception("Sanjeev Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("PQR");

        String Exce_Flag="N";

        if(Exce_Flag.equals("N")){
            try {
                throw new Exception("Exception Flag is Blank");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("XYZ");
    }
}
