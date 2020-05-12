package Examples.Arrays;

//Write a Java program to calculate the average value of array elements.
public class Arrays_04 {
    public static void main(String[] args) {
        //Initiate Arrays
        int[] arr = {11, 2, 4, 56, 7, 9, 123};
        int calc = 0;
        int average = 0;
        //Calculate Average
        for (int i = 0; i < arr.length; i++) {
            calc = (calc + arr[i]);
            average = calc / arr.length;
        }
        System.out.printf("Average of array elements :" + average);
    }
}
