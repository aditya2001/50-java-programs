package com.practice.string;

public class P04PalindromeString {

    public static void main(String[] args){
        String str = "yo oy";
        checkPalindrome(str);
    }

    private static void checkPalindrome(String str) {
        String newStr = "";
        for(int i=str.length()-1; i>=0; i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
        if(str.equals(newStr)){
            System.out.println("palindrome");
        }
    }
}
