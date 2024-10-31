package com.practice.number;

public class P05SumOfDigitsOfNumber {

    public static void main(String[] args){
        int n = 123;
        getSum(n);
    }
    static void getSum(int n){
        int sum = 0;
         while(n!=0){
             sum = sum + n % 10;
             n = n/10;
         }
         System.out.println(sum);
    }
}
