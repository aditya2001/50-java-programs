package com.practice.string;

public class P13SmallestWordInAString {

    public static void main(String[] args){
        String str = "This is my first java program";
        smallest(str);
    }

    static void smallest(String str) {
        String[] arr = str.split(" ");
        String min = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i].length() < min.length()){
                min = arr[i];
            }
        }

        System.out.println(min);

    }

}
