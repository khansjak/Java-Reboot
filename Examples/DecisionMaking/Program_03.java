package Examples.DecisionMaking;

import java.util.Scanner;

//Java Program to Check Whether a Number is Positive or Negative
public class Program_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = in.nextInt();

        if (number < 0)
            System.out.println("Its a negetive number ");
        else
            System.out.println("Its a positive number ");
    }
}
