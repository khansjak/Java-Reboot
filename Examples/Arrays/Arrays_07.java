package Examples.Arrays;

import java.util.Arrays;

//Write a Java program to insert an element (specific position) into an array.
public class Arrays_07 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        //Lets insert a value of 5 on index position 2
        int IndexPos = 2;
        int ArrayVal = 5;

        System.out.println("Original Array :"+ Arrays.toString(my_array));

        //Traverse
        for (int i = my_array.length; i < IndexPos; i--) {
            my_array[i] = my_array[i-1];
        }

        //Set Value
        my_array[IndexPos] = ArrayVal;
        System.out.println("New Array :"+Arrays.toString(my_array));
    }
}
