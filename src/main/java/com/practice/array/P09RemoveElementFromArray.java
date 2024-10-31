package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class P09RemoveElementFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 2, 4, 5, 2};
        removeElement(arr);
    }

    static void removeElement(int[] arr) {

        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 2) {
                ls.add(arr[i]);
            }
        }
        int[] newArr = new int[ls.size()];
        for (int k = 0; k <= newArr.length - 1; k++) {
            newArr[k] = ls.get(k);
        }

        for (int num : newArr) {
            System.out.println(num);
        }
    }
}



