package com.practice.string;

public class P01CountOfCharactersInAString {
    public static void main(String[] args){
        String str = "hello world";
        String[] arr = str.split(" ");
        count(arr);
    }
    static void count(String[] arr){
        int count =0;
         for(String str: arr){
             count = count + str.length();
         }
         System.out.println(count);
    }
}
