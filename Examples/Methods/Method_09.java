package Examples.Methods;

import java.util.Scanner;

//Write Java methods to calculate the area of a triangle.
public class Method_09 {

    public static double AreaOfTriangle(double width, double height) {
        return (width * height) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter width :");
        double width = in.nextDouble();
        System.out.println("Enter height :");
        double height = in.nextDouble();

        System.out.println("Area of the triangle is :" + AreaOfTriangle(width, height));
    }

}
