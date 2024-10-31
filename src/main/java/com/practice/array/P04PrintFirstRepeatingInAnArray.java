package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class P04PrintFirstRepeatingInAnArray {

    public static void main(String[] args){
        int[] arr = {2,1,3,4,5,6,2};
        printDuplicates(arr);
    }

    static void printDuplicates(int[] arr){
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<=arr.length-1; i++){
            if(!ls.contains(arr[i])){
                ls.add(arr[i]);
            }
            else{
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
