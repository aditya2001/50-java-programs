package com.practice.string;

public class P05PrintInitialsOfName {

    public static void main(String[] args){
        String str = "Aditya Kumar Choudhary";
        capital(str);
    }
    static void capital(String str){
        String[] arr = str.split(" ");
        String newStr = "";
        String first = arr[0].substring(0,1).toUpperCase() + " ";
        String middle = arr[1].substring(0,1).toUpperCase() + " ";
        String last = arr[2];
        newStr = newStr + first + middle + last;
        System.out.println(newStr);
    }
}
