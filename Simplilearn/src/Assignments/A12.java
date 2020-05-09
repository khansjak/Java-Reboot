package Assignments;

import java.util.Scanner;

//Write a program which accepts days as integer and display total number of years, months and days in it. for example:
// If user input as 856 days the output should be 2 years 4 months 6 days.
public class A12 {
    public static void main(String[] args) {
        int m , years ,  weeks , days;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of days :");

        m=in.nextInt();
        years=m/365;
        m=m%365;
        System.out.println("Years :"+years);
        weeks=m/7;
        m=m%7;
        System.out.println("Weeks :"+weeks);
        days=m;
        System.out.println("Days :"+days);

    }
}
