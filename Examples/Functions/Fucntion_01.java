package Examples.Functions;

import java.util.Scanner;

//Multiply Two Floating Point Numbers
public class Fucntion_01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number ");
        float num1 = in.nextFloat();
        System.out.println("Enter second number ");
        float num2 = in.nextFloat();

        System.out.println("Multiplication of two float numbers :" + (num1 * num2));

    }
}
