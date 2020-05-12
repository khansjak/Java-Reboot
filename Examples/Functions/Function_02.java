package Examples.Functions;

import java.util.Scanner;

//Java Program to Display Prime Numbers Between Intervals Using Function
public class Function_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("From :");
        int from = in.nextInt();
        System.out.println("To :");
        int to = in.nextInt();

        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }
}
