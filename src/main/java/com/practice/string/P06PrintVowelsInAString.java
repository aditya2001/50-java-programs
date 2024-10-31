package com.practice.string;

public class P06PrintVowelsInAString {

    public static void main(String[] args){
        String str = "aditya";
        printVowels(str);
        
    }
    
    static void printVowels(String str){
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                System.out.println("Vowels-" + str.charAt(i));
            }
        }
    }
}
