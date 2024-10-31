package com.practice.OOPS;

public class P01ArrayHomogenous {

    public static void main(String args[]){
        int[] arr =new int[3];//declaration and instantiation
        boolean[] boolArr = { true, true, false, true };
        char[] charArr = { 'g', 'e', 'e', 'k', 's' };
        arr[0]=10;//initialization
        arr[1]=20;
//traversing array
        for(int i=0;i<arr.length;i++)//length is the property of array
            System.out.println(arr[i]);
    }}
