package com.practice.string;

public class P03CountVowelsInAString {

    public static void main(String[] args){
        String str = "aditya";
        countVowels(str);
        
    }
    
    static void countVowels(String str){
        int count =0;
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
