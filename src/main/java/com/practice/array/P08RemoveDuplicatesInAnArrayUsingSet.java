package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class P08RemoveDuplicatesInAnArrayUsingSet {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,3,4,5};
        removeDuplicates(arr);
    }

    static void removeDuplicates(int[] arr){

        Set<Integer> hs = new HashSet<>();
        for(int i=0; i<=arr.length-1; i++){
              hs.add(arr[i]);
        }

        int[] newArr = new int[hs.size()];
        int k=0;
        for(int num : hs){
            newArr[k] = num;
            k++;
        }
        for(int n : newArr) {
            System.out.println(n);
        }
    }
}
