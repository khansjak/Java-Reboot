package Assignments;

import java.util.Scanner;

//14.	Write a program to check whether the given number is even or odd (use ternary operator)
public class A08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int val = in.nextInt();

        if (val%2==0)
            System.out.println("Value is even");
        else
            System.out.println("Value is odd");
    }
}
