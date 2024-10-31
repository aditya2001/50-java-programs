package com.practice.string;

public class P02CountSpacesInAString {

    public static void main(String[] args){
        String str = "This is my first program";
        P02CountSpacesInAString ct = new P02CountSpacesInAString();
        ct.count(str);
    }

    void count(String str) {
        int count =0;
      for(int i=0; i<=str.length()-1; i++){
          if(str.charAt(i)==' '){
              count++;
          }
      }
      System.out.println(count);
    }


}
