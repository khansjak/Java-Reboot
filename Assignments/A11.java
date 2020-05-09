package Assignments;

import java.util.Scanner;

//21.	Write a program which accepts a character and display its next character.
public class A11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        System.out.println("Next character is "+(char)((c>>1)+'0'));

    }
}
