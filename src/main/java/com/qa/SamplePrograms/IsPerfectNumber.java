package com.qa.SamplePrograms;

public class IsPerfectNumber {
    public void isPerfectNumber(int number){
        int temp=0;
        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                temp=temp+i;
            }
        }
        if(temp==number){
            System.out.println("Perfect number is :"+number);
        }
        else
            System.out.println("Not a Perfect is :"+number);

    }

    public static void main(String[] args) {
        IsPerfectNumber obj=new IsPerfectNumber();
        obj.isPerfectNumber(8);
        obj.isPerfectNumber(20);
        obj.isPerfectNumber(81);
        obj.isPerfectNumber(28);


    }
}
