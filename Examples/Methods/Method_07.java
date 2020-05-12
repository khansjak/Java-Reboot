package Examples.Methods;

/*
Write a Java method to check whether a string is a valid password. Go to the editor
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
 */

import java.util.Scanner;

public class Method_07 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 10) return false;

        int charCount = 0;
        int numCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isNumeric(ch)) numCount++;
            else if (isLetter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }


    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isNumeric(char ch) {
        return (ch > '0' && ch <= '9');
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Welcome123111";
        if (isValidPassword(str))
            System.out.println("Valid password");
        else
            System.out.println("Not Complaint");

    }
}
