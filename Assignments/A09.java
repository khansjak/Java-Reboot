package Assignments;

import java.util.Scanner;

//17.	Write a program which input three numbers and display the largest number using ternary operator.
public class A09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three values :");
        int num1 , num2,num3;
        num1=in.nextInt();num2=in.nextInt();num3=in.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Largest number is "+num1);
        }
        else if (num2>num1 && num1>num3){
            System.out.println("Largest number is "+num2);
        }
        else
            System.out.println("Largest number is "+num3);
    }
}
