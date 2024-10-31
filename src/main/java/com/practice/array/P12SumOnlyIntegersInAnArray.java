package com.practice.array;

public class P12SumOnlyIntegersInAnArray {

    public static void main(String[] args){
        String[] arr = {"5","2","1","#","$"};
        sum(arr);
    }

    static void sum(String[] arr){
      int sum =0;
      for(String str : arr){
          try{
              int num = Integer.parseInt(str);
              sum = sum + num;
          }
          catch(NumberFormatException e){

          }
      }
        System.out.println(sum);

    }
}
