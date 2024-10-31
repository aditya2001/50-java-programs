package com.practice.string;

public class P07ReverseEachWordInAString {

    public static void main(String[] args){
        String str = "Hello World";
        reverseWords(str);
    }

    static void reverseWords(String str){
        String newStr = "";
        String[] arr = str.split(" ");
        for(String word: arr){
            for(int i=word.length()-1; i>=0; i--){
                newStr = newStr + word.charAt(i);
            }
            newStr = newStr + " ";
        }
        System.out.println(newStr);
    }
}
