package com.practice.array;
import java.util.*;

public class P15CountOfEachNumberInArray {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,2};
        count(arr);
    }

    static void count(int[] arr){
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<=arr.length-1; i++){
          if(hm.containsKey(arr[i])){
              hm.put(arr[i], hm.get(arr[i]) + 1);
          }
          else{
              hm.put(arr[i], 1);
          }
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
