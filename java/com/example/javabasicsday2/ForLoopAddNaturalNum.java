package com.javabasics.day2;
import java.util.*;
public class ForLoopAddNaturalNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = s.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            sum = sum + i ;
            //System.out.println("Sum is: "+sum);
        }
        System.out.println("Sum is: "+sum);

    }

}

