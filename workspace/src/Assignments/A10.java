package Assignments;

import java.util.Scanner;

/*
Write a program which accepts amount as integer and display total number of Notes of Rs. 500, 100, 50, 20, 10, 5 and 1.
For example, when user enter a number, 575,
the results would be like this...
500: 1, 100: 0, 50: 1, 20: 1, 10: 0, 5: 1, 1: 0
 */
public class A10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount :/n");
        int amount = in.nextInt();

        int[] notes = new int[]{2000,500,200,100,50,20,10,5,1};
        int[] noteCounter = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount>=notes[i]){
                noteCounter[i]=amount/notes[i];
                amount=amount-noteCounter[i]*notes[i];
            }
        }

        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] !=0){
                System.out.println(notes[i]+":"+noteCounter[i]);
            }
        }

    }
}
