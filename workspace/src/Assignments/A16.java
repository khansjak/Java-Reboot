package Assignments;

import java.util.Scanner;

/*
Write a program to calculate the total expenses. Quantity and price per item are input by the user and discount of 10% is offered if the expense is more than 5000.
 */
public class A16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        itemdata ob = new itemdata();
        ob.get();
        System.out.println("\n\t Enter Item Name :");
        name=in.nextLine();
        ob.cost();
        ob.displayLines(name);
    }

    static class itemdata{
        Scanner in = new Scanner(System.in);
        int number;
        double quantity,price,cost=0;
        void get(){
            System.out.println("\n\t Enter item number :");
            number = in.nextInt();
        }

        void cost(){
            System.out.println("\n\t Enter item quantity :");
            quantity = in.nextDouble();
            System.out.println("\n\t Enter item price per unit :");
            price = in.nextDouble();
            cost=quantity*price;
            if (cost>5000){
                cost=(cost-(cost*0.01));
            }
        }

        void displayLines(String name){
            System.out.println("\n\t Item Number        :"+number);
            System.out.println("\n\t Item Name          :"+name);
            System.out.println("\n\t Item Quantity      :"+quantity);
            System.out.println("\n\t Price per unit     :"+price);
            System.out.println("\n\t Total Cost         :"+cost);
        }
    }
}
