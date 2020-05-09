package Assignments;

//8.	Write a program which accept principle, rate and time from user and print the simple interest.

import java.util.Scanner;


public class A05 {
    public static void main(String[] args) {
        float p,r,f;
        int t;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal Amount :");
        p=in.nextFloat();
        System.out.println("Enter Rate of Interest :");
        r=in.nextFloat();
        System.out.println("Enter time in years    :");
        t=in.nextInt();
        System.out.println("Final amount to pay will be :"+calculate(p,r,t));

    }

    private static float calculate(float p, float r, float t) {
        return p+(p*r*t);
    }



}
