package Examples.Arrays;

//Write a Java program to find the duplicate values of an array of integer values.
public class Arrays_10 {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 14, 49};
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = 0; j < my_array.length; j++) {
                if ((my_array[i] == my_array[j]) && (i != j))
                    System.out.println("Duplicate Element :" + my_array[j]);
            }
        }
    }
}
