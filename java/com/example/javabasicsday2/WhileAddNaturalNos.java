package com.javabasics.day2;
import java.util.*;
public class WhileAddNaturalNos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural Number:");
        int n = sc.nextInt();
        int sum=0;
        while(n != 0)
        {
            sum = sum + n;
            n--;
            //System.out.println("sum of N Natural Number: "+sum);
        }
        System.out.println("sum of N Natural Number: "+sum);

    }

}