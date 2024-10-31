package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class P01HighestOccuringWordInString {
       public static void main(String[] args){
           String str = "This is This is This my new program";
           String[] arr = str.split(" ");
           highest(arr);
       }

       static void highest(String[] arr){
           Map<String, Integer> hm = new HashMap<>();
           for(int i=0; i<=arr.length-1; i++){
               if(!hm.containsKey(arr[i])){
                   hm.put(arr[i], 1);
               }
               else {
                   hm.put(arr[i], hm.get(arr[i])+1);
               }
           }
           int value = 0;
           String key ="";
           for(Map.Entry<String, Integer> entry : hm.entrySet()){
               if(entry.getValue() > value){
                   value = entry.getValue();
                   key = entry.getKey();
               }
           }
           System.out.println(value);
           System.out.println(key);

       }

}
