package Examples.DecisionMaking;

import java.util.Scanner;

//Generate a multiplication Table
public class Program_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = in.nextInt();

        for (int i = 1; i < 11; i++) {
            int table = number * i;
            System.out.println(number + " X "+i+" = "+table);

        }

    }
}
