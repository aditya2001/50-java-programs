package com.practice.string;

public class P11ReverseSequenceOfWord {

    public static void main(String[] args){
        String str = "This is my first java program";
        reverseSequence(str);
    }

    static void reverseSequence(String str) {
         String[] arr = str.split(" ");
         String rev = "";
         for(int i=arr.length-1; i>=0; i--){
             rev = rev + arr[i] + " ";
         }
         System.out.println(rev);

    }

}
