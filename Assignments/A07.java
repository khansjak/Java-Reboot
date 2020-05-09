package Assignments;
//12.	Write a program to check whether the given number is positive or negative (ternary operator)

import java.util.Scanner;

public class A07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int val = in.nextInt();

        if (val>0)
            System.out.println("Its a positive value ");
        else
            System.out.println("Its a negetive value ");

    }
}
