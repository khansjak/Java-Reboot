package Examples.Arrays;

import java.util.Arrays;

//Write a Java program to reverse an array of integer values.
public class Arrays_09 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        for (int i = 0; i < my_array.length; i++) {
            System.out.println(my_array[i]);
        }

        int[] your_array = new int[my_array.length];
        for (int i = 0; i < my_array.length; i++) {
            your_array[i] = my_array[my_array.length - 1 - i];
        }
        System.out.println(Arrays.toString(your_array));
    }

}
