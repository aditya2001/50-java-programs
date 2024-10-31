package com.practice.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P15PrintUniqueWordInAString {

    public static void main(String[] args){
        String str = "This is is my first first program";
        notDuplicate(str);
    }

    static void notDuplicate(String str){
        String[] arr = str.split(" ");
        List<String> ls = new ArrayList<>();
        for(int i=0; i<= arr.length-1; i++){
                if(!ls.contains(arr[i])){
                    ls.add(arr[i]);
                }
        }
        for(String word: ls){
            System.out.println(word);
        }
    }

    static void unique(String str) {
     String[] arr = str.split(" ");
     Map<String, Integer> hm = new HashMap<>();
     for(int i=0; i<=arr.length-1; i++){
         if(!hm.containsKey(arr[i])){
             hm.put(arr[i], 1);
         }
         else{
             hm.put(arr[i], hm.get(arr[i])+1);
         }
     }
     for(Map.Entry<String, Integer> entry: hm.entrySet()){
         if (entry.getValue() == 1) {
             System.out.println(entry.getKey() + "-" + entry.getValue());
             break;
         }
     }

    }

}
