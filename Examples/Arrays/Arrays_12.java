package Examples.Arrays;

import java.util.Arrays;

//Write a Java program to find the second largest element in an array.
public class Arrays_12 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(Arrays.toString(my_array));
        Arrays.sort(my_array);
        System.out.println(Arrays.toString(my_array));
        for (int i = 0; i < my_array.length - 1; i++) {
            System.out.printf("");

        }
        System.out.println("Largest value " + my_array[my_array.length - 1]);
        System.out.println("Second largest value is :" + my_array[my_array.length - 2]);

    }
}
