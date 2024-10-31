package com.practice.array;

public class P05PrintPrimeAndNonPrimeInArray {
    public static void main(String[] args){
        int[] arr ={2,3,5,8,4,6};
        print(arr);
    }

    static void print(int[] arr){
        for(int num : arr){
            boolean isPrime = true;
            for(int j=2; j<num; j++){
                if(num%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
              System.out.println(num);
            }
        }
    }

}
