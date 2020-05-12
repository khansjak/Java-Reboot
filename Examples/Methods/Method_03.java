package Examples.Methods;
//Write a Java method to display the middle character of a string.

import java.util.Scanner;

public class Method_03 {

    public static String middleOne(String str) {

        int length;
        int position;

        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = in.nextLine();
        System.out.println("Middle Character is " + middleOne(str));

    }
}
