package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class P07RemoveDuplicatesInAnArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,3,4,5};
        removeDuplicates(arr);
    }

    static void removeDuplicates(int[] arr){

        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<=arr.length-1; i++){
            if(!ls.contains(arr[i])){
                ls.add(arr[i]);
            }
            else{
//                System.out.println(arr[i]);
            }
        }

        int[] newArr = new int[ls.size()];
        for(int k=0; k<=ls.size()-1; k++){
            newArr[k] = ls.get(k);
            System.out.println(newArr[k]);
        }
    }
}
