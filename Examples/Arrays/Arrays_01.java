package Examples.Arrays;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Arrays_01 {

    public static void main(String[] args) {

        //Construct and sort a numeric array

        int[] arr = {2, 6, 1, 53, 16, 47, 80};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Construct and sort string array

        String[] arr2 = {"Java","Python","Ruby","Kotlin","Big Data","Machine Learning"};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
