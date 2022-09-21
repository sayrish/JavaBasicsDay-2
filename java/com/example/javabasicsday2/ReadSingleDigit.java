package com.javabasics.day2;

import java.util.*;
public class ForLoopReverseNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = s.nextInt();
        int rev = 0; //Stores the reversed number
        int rem ; //stores the remainder
        System.out.println("Actual Number: "+ n);
        for(int i=n ; i > 0; )//no need of decrement here
        {
            rem = i % 10 ;
            rev = rev * 10 + rem;
            i = i / 10;

        }
        System.out.println("Reversed Number is: "+ rev);

    }

}