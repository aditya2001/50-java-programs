package com.practice.number;

public class P03CountOfDigitsInANumber {

    public static void main(String[] args){
        int n = 12345;
        countDigits(n);
    }
    static void countDigits(int n){
        int count = 0;
         while(n!=0){
             n = n /10;
            count++;
         }
         System.out.println(count);
    }
}
