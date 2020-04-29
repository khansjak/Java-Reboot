package Assignments;

import java.util.Scanner;

//10.	Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered by the user.
// A triangle is valid if the sum of all the three angles is equal to 180 degrees.
public class A19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter first angle :");
        int angle1 = in.nextInt();
        System.out.println(" Enter second angle :");
        int angle2 = in.nextInt();
        System.out.println(" Enter third angle :");
        int angle3 = in.nextInt();

        if (angle1+angle2+angle3==180)
            System.out.println("Valid triangle");
        else
            System.out.println("Not valid traingle");

    }
}
