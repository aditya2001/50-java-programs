package com.practice.string;

public class P08ReverseString {

    public static void main(String[] args){
        String str = "Aditya";
        reverse(str);
    }

    static void reverse(String str){
        String newStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            newStr = newStr + str.charAt(i);
        }
        System.out.print(newStr);
    }
}
