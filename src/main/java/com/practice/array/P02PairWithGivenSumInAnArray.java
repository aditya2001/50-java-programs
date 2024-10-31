package com.practice.array;

public class P02PairWithGivenSumInAnArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,2};
        int target = 5;
        pair(arr, target);
    }

    static void pair(int[] arr, int target){
            for(int i=0; i<=arr.length-1; i++){
                for(int j=i+1; j<=arr.length-1; j++){
                    if(arr[i] + arr[j]==target){
                        System.out.println(arr[i]+ "-" + arr[j]);
                    }
                }
            }
    }
}
