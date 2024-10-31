package com.practice.array;

public class P14MoveZeroesToTheLeft {

    public static void main(String[] args){
       int[] arr = {0,0,3,0,5,6};
       move(arr);
    }

    static void move(int[] arr){
          for (int i= arr.length-1; i>=0; i--) {
              for (int j=i-1; j>=0; j--) {
                  if (arr[i] == 0) {
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
              }
          }
        for(int n: arr){
            System.out.println(n);
        }
    }
}
