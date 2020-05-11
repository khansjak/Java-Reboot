package Sorting;

import java.util.Arrays;

class SelectionSort {
    void selectionSort(int array[]) {
        int size = array.length;
        for (int step = 0; step < size - 1; step++) {
            int minimum = step;

            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[minimum]) {
                    minimum = i;
                }
            }
            int temp = array[step];
            array[step] = array[minimum];
            array[minimum] = temp;
        }
    }
}


public class p077_SelectionSort {
    public static void main(String[] args) {
        int[] data = {20, 10, 5, 2};
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Selection Sorted Data ");
        System.out.println(Arrays.toString(data));
    }
}
