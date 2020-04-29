package Assignments;

import java.util.Scanner;

//Check if the given year is leap year ?
public class A20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = in.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Year is leap year ");
        } else {
            System.out.println("Year isnt a leap year ");
        }

    }
}
