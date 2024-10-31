package com.practice.number;

public class P01ArmstrongNumber {

    public static void main(String[] args) {

        int number = 371, originalNumber, lastdigit;
        int armstrong = 0;
//
        originalNumber = number;

        while (originalNumber != 0)
        {
            lastdigit = originalNumber % 10;
            armstrong += armstrong + lastdigit*lastdigit*lastdigit;
            originalNumber = originalNumber/10;
        }

        if(armstrong == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
