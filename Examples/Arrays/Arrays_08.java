package Examples.Arrays;
// Write a Java program to find the maximum and minimum value of an array.

import java.util.Arrays;

public class Arrays_08 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Arrays.toString(my_array);
        Arrays.sort(my_array);

        for (int i = 0; i < my_array.length; i++) {
            System.out.println();
        }
        System.out.println("Minimum :" + my_array[0]);
        System.out.println("Maximum :" + my_array[my_array.length - 1]);
    }

}
