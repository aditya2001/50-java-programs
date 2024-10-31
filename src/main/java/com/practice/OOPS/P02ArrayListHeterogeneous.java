package com.practice.OOPS;

import java.util.ArrayList;

public class P02ArrayListHeterogeneous {
    public static void main(String[] args) {
        ArrayList myNumbers = new ArrayList();
        myNumbers.add("10");
        myNumbers.add(15);
        myNumbers.add(20);
        for (Object i : myNumbers) {
            System.out.println(i);
        }
    }
}
