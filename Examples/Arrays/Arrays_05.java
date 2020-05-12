package Examples.Arrays;
//Write a Java program to find the index of an array element.

public class Arrays_05 {

    public static int findIndex(int[] arr, int t) {
        if (arr == null) return -1;
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Index position of 8 is :" + findIndex(arr, 8));
    }
}
