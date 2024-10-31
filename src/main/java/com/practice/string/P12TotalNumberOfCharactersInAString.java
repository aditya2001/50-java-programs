package com.practice.string;



public class P12TotalNumberOfCharactersInAString {
    public static void main(String[] args){
        String str = "hello world";
        countChars(str);
    }
    static void countChars(String str){
        int count =0;
        for(int i=0; i<=str.length()-1; i++) {
        if(str.charAt(i)!=' '){
            count++;
           }
        }
        System.out.println(count);
    }
}
