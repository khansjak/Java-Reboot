package Examples.Arrays;
//Write a Java program to remove duplicate elements from an array.
public class Arrays_12 {

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 14, 49};

        int duplicate =0;
        for (int i = 0; i < my_array.length; i++) {
            for (int j = i+1; j < my_array.length; j++) {
                if (my_array[i]==my_array[j])
                    my_array[i]

            }
            System.out.println(duplicate);
        }
    }
}
