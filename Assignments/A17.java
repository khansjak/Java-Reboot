package Assignments;

import java.util.Scanner;

//6.	Write a program to determine whether the seller has made profit or incurred loss.
// Also determine how much profit he made or loss he incurred. Cost price and selling price of an item is input by the user.
public class A17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\t What was the base price of item \n");
        double basePrice = in.nextDouble();
        System.out.println("\n\t and how much you sold it for\n");
        double soldPrice = in.nextDouble();

        if (soldPrice>basePrice)
            System.out.println("Good business ! you are in profit of "+(soldPrice-basePrice));
        else
            System.out.println("Ohh i am sorry man you lost "+(soldPrice-basePrice)+ " on this item");

    }
}
