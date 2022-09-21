package com.javabasics.day2;
import java.util.*;
public class DisplayUnit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number(1,10,100....): ");
        int number = s.nextInt();
        if( number == 1 )
            System.out.println("unit");
        else if( number == 10)
            System.out.println("Ten");
        else if( number == 100)
            System.out.println("Hundred");
        else if( number == 1000)
            System.out.println("Thousand");
        else if( number == 10000)
            System.out.println("Ten Thousand");
        else
            System.out.println("Try Again...!");

    }

}

