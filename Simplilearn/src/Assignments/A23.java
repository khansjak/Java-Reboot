package Assignments;

import java.util.Scanner;

/*
17.	The marks obtained by a student in 5 different subjects are input by the user. The student gets a division as per the following rules:
Percentage above or equal to 60 - First division
Percentage between 50 and 59 - Second division
Percentage between 40 and 49 - Third division
Percentage less than 40 - Fail
Write a program to calculate the division obtained by the student.

 */
public class A23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double mark1, mark2, mark3, mark4, mark5, got, total, percentile;

        System.out.println("Enter marks for subject 1:");
        mark1 = in.nextInt();

        System.out.println("Enter marks for subject 2:");
        mark2 = in.nextInt();

        System.out.println("Enter marks for subject 3:");
        mark3 = in.nextInt();

        System.out.println("Enter marks for subject 4:");
        mark4 = in.nextInt();

        System.out.println("Enter marks for subject 5:");
        mark5 = in.nextInt();

        got = mark1 + mark2 + mark3 + mark4 + mark5;
        total = 500;

        percentile = (got / total) * 100;
        System.out.println("Got " + percentile + "%");


    }
}
