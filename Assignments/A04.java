package Assignments;

import java.util.Scanner;

//Accept temp in centigrade and convert it into Fahrenheit
//Implement formula (0°C × 9/5) + 32 = 32°F
public class A04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temp in centigrade :");
        float cent = in.nextFloat();

        //Do the math here
        System.out.println("Temperature  in Fahrenheit  :"+((cent*9/5)+32));
    }
}
