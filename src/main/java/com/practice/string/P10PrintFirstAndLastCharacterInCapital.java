package com.practice.string;

public class P10PrintFirstAndLastCharacterInCapital {

    public static void main(String[] args){
        String str = "divisha";
        capital(str);
    }
    static void capital(String str){
        String[] arr = str.split(" ");
        String newStr = "";
        String first = str.substring(0,1).toUpperCase();
        String middle = str.substring(1,str.length()-1);
        String last = str.substring(str.length()-1).toUpperCase();
        newStr = newStr + first + middle + last;
        System.out.println(newStr);
    }
}
