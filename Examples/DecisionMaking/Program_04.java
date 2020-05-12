package Examples.DecisionMaking;

import java.util.Scanner;

//Java Program to Check Alphabet using if else
public class Program_04 {
    public static void main(String[] args) {
        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

        //Check Alphabet using ternary operator
        String output = ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                ? c + " is an alphabet "
                : c + " is not an alphabet";

        System.out.println(output);
    }
}
