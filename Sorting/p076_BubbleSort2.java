package Sorting;

import java.util.Arrays;

class BubbleSort2 {
    //Create Method with data input
    void buubleSort(int array[]) {
        //Define array Size
        int size = array.length;

        //First Loop
        for (int i = 0; i < size - 1; i++) {
            //Define a boolean value which keep track of swapping
            boolean swapped = true;
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = false;
                }
                if (swapped == true)
                    break;
            }
        }
    }
}

public class p076_BubbleSort2 {
    public static void main(String[] args) {
        int[] data = {-2, -9, 10, 45, 0};
        BubbleSort2 bs = new BubbleSort2();
        bs.buubleSort(data);
        System.out.println("Sorted Array in Ascending order :");
        System.out.println(Arrays.toString(data));

    }
}
