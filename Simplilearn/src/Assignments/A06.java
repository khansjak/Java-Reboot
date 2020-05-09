package Assignments;
//10.	Write a program to swap the values of two variables.


import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first value :");
        int val1 = in.nextInt();
        System.out.println("Enter second value :");
        int val2 = in.nextInt();

        System.out.println("Before swap :"+val1+val2);

        /* Formula is
          x = x + y;
          y = x - y;
          x = x - y;
         */

        val1 = val1+val2;
        val2=val1-val2;
        val1=val1-val2;
        System.out.println("After swap :"+val1+val2);

    }
}
