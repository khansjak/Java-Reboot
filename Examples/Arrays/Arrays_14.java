package Examples.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Write a Java program to test the equality of two arrays.
public class Arrays_14 {

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        int len = arr1.length;

        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[i])
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] my_array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 491};
        System.out.println("Arrays Equality Check :"+isEqual(my_array1,my_array));
    }
}
