package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class P06PrintUniqueElementsInArray {

    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,3,4,5};
        unique(arr);
    }

    static void unique(int[] arr){
        List<Integer> ls = new ArrayList<>();
       for(int i=0; i<=arr.length-1; i++){
          if(!ls.contains(arr[i])){
              ls.add(arr[i]);
          }
      }
       for(int num : ls){
           System.out.println(num);
       }
    }
}
