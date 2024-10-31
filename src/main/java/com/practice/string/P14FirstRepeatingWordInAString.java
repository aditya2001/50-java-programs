package com.practice.string;

import java.util.ArrayList;
import java.util.List;

public class P14FirstRepeatingWordInAString {

    public static void main(String[] args){
        String str = "This is my my first first program";
        repeat(str);
    }

    private static void repeating(String str) {
        String[] arr = str.split(" ");
        List<String> ls = new ArrayList<>();
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

    private static void repeat(String str) {
        String[] arr = str.split(" ");
        int count =1;
         for(int i=0; i<=arr.length-1; i++){
             for(int j=i+1; j<=arr.length-1; j++){
                 if(arr[i].equals(arr[j])){
                     if(count==2) {
                         System.out.println(arr[i]);
                     }
                     count++;
                 }
             }
         }
    }
}
