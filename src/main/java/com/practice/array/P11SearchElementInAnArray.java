package com.practice.array;

public class P11SearchElementInAnArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,3,4,5};
        search(arr);
    }

    static void search(int[] arr){
     for(int i=0; i<=arr.length-1; i++){
         if(arr[i]==5){
             System.out.println(arr[i]);
         }
     }

    }
}
