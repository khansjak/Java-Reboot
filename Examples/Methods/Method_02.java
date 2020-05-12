package Examples.Methods;
//Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class Method_02 {

    public static double average(double a, double b, double c) {
        Double avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        double a = in.nextDouble();
        System.out.println("Enter second number :");
        double b = in.nextDouble();
        System.out.println("Enter third number :");
        double c = in.nextDouble();

        System.out.println("Average is " + average(a, b, c));
    }
}
