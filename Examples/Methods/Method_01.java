package Examples.Methods;

import java.util.Scanner;

//Write a Java method to find the smallest number among three numbers.
public class Method_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        double a = in.nextDouble();
        System.out.println("Enter second number :");
        double b = in.nextDouble();
        System.out.println("Enter third number :");
        double c = in.nextDouble();

        System.out.println("Smallest value is " + smallest(a, b, c));
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }

}
