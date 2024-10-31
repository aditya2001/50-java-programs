package com.practice.series;

public class P04PrimeNum {
    public static void main(String[] args) {
        int num = 2;
        int cnt =0;
        while (num < 50) {
            if (checkPrime(num)) {
                System.out.println(num);
                cnt++;
            }
            num++;
        }
    }

    static boolean checkPrime(int num){

            boolean isPrime = true;
            for(int i=2; i<num; i++){
                if(num%i==0){
                    return false;
                }
            }
        return true;
    }
}