package com.practice.number;

public class P06LargestOfThreeNumbers {

    public static void main(String[] args){
        int n1 = 5;
        int n2 = 10;
        int n3 = 3;
        if(n1 > n2 && n1 > n3){
            System.out.println("n1 is the largest");
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("n2 is the largest");
        }
        else{
            System.out.println("n3 is the largest");
        }
    }
}
