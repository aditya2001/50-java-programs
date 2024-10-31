package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class P03PrintDuplicatesInAnArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,3,4,5,1,1};
        printDuplicate(arr);
    }


    static void printDuplicate(int[] arr){
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<=arr.length-1; i++){
          boolean isDuplicate = false;
          for(int j=i+1; j<=arr.length-1; j++){
              if(arr[i]==arr[j]){
                  isDuplicate = true;
                  break;
              }
          }
          if(isDuplicate){
              System.out.println(arr[i]);
          }
      }

    }
    static void printDuplicates(int[] arr){
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<=arr.length-1; i++){
            if(!ls.contains(arr[i])){
                ls.add(arr[i]);
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}
