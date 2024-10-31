package com.practice.array;

public class P10ReverseArray {

    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,6};
       reverse(arr);
    }

    static void reverse(int[] arr){
        for(int i=0; i<=(arr.length-1)/2; i++){
            for(int j=arr.length-1-i; j>=arr.length-1-i; j--){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int n: arr){
            System.out.println(n);
        }
    }
}
