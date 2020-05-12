package Examples.DecisionMaking;
//Java Program to Find Factorial of a Number

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = in.nextInt();

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial is :" + factorial);
    }
}



/*
Formula of Factorial
The factorial of n is denoted ny n! and calculated by the product of integer number from 1 to n.

for n>0
n! = 1*2*3*....*n;
Recursive Factorial Formula : n! = n×(n-1)!
 */