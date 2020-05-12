package Examples.Arrays;

import java.util.Arrays;
import java.util.Iterator;

//Write a Java program to sum values of an array.

public class Arrays_02 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 53, 16, 47, 80};
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
