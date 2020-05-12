package Examples.Arrays;
//Write a Java program to find a missing number in an array.

public class Arrays_15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8};
        for (int i = 0; i < array.length-1; i++) {
            if (array[i + 1] != array[i] + 1)
                System.out.println("Missing element is " + (array[i] + 1));
        }
    }
}
