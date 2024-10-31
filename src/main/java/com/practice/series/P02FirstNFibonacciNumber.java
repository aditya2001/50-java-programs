package com.practice.series;

public class P02FirstNFibonacciNumber {
    public static void main(String[] args){
        int n = 5;
        printFibonacci(n);
    }

    static void printFibonacci(int n){
        int n1 = 0;
        System.out.println(n1);
        int n2 = 1;
        System.out.println(n2);
        int sum = n1 + n2;
       for(int i=0; i<=n; i++){
           sum = n1 + n2;
           System.out.println(sum);
           n1 = n2;
           n2 = sum;

       }
    }
}
