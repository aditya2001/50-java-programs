package com.practice.array;

import java.util.HashSet;
import java.util.Set;

public class P01CommonElementsInTwoArray {

    public static void main(String[] args){
        int[] arr1 = {3,4,5,6,79,3,4,5};
        int[] arr2 = {3,2,5,6,79,4,1,6};
        common2(arr1, arr2);
    }

    static void common1(int[] arr1, int[] arr2) {
       Set<Integer> ls = new HashSet<Integer>();
        for(int num: arr1){
           ls.add(num);
       }
        for(int i=0; i<=arr2.length-1; i++){
            if(ls.contains(arr1[2])){
                System.out.println(arr1[2]);
            }
        }
    }

    static void common2(int[] arr1, int[] arr2) {
      for(int i=0; i<=arr1.length-1;i++){
          for(int j=0; j<=arr2.length-1; j++){
              if(arr1[i]==arr2[j]){
                  System.out.println(arr1[i]);
              }
          }
      }
    }
}
