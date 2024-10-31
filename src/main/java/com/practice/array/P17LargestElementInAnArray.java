package com.practice.array;

public class P17LargestElementInAnArray {

    public static void main(String[] args){
        int[] arr = {3,4,5,6,79,3,4,5};
        largest(arr);
    }

    static void largest(int[] arr){
        int max = arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
