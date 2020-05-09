package Assignments;

/*
15.	Write a program to calculate the monthly telephone bills as per the following rule:
Minimum Rs. 200 for up to 100 calls.
Plus Rs. 0.60 per call for next 50 calls.
Plus Rs. 0.50 per call for next 50 calls.
Plus Rs. 0.40 per call for any call beyond 200 calls.

*/

import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of calls :\n");
        double calls,price = 0;
        calls = in.nextInt();
        

        if (calls-100>0){
            price=200;
            calls=calls-100;
            price=200+(calls*0.60);
        }

    }
}
