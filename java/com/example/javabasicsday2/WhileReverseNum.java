
package com.javabasics.day2;

public class WhileReverseNum {

    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        int rem;
        System.out.println("Actual Num: "+n);
        while( n > 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10 ;

        }
        System.out.println("Reverse Num: "+rev);

    }

}