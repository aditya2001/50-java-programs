package com.practice.string;

public class P09LargestWordInAString {

    public static void main(String[] args){
        String str = "This is my first java program";
        largest(str);
    }

    static void largest(String str) {
        String[] arr = str.split(" ");
        String max = arr[0];

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i].length() > max.length()){
                max = arr[i];
            }
        }

        System.out.println(max);

    }

}
