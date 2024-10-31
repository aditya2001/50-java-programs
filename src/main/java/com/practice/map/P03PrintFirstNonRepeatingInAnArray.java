package com.practice.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class P03PrintFirstNonRepeatingInAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 4, 2, 3};
        printUnique(arr);
    }

    static void printUnique(int[] arr) {
        Map<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                    System.out.print(entry.getKey() + " ");
                    break;
                }
            }
          }
        }




