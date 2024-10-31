package com.practice.map;

import java.util.*;

public class P04PrintFirstNonRepeatingWordInAString {
    public static void main(String[] args) {
        String str = "This This is is my first first program";
        String[] arr = str.split(" ");
        firstRepeating(arr);
    }
    static void firstRepeating(String[] arr){
        Map<String, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
                break;
            }
        }
    }


}
