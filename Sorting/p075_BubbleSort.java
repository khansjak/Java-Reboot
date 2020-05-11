package Sorting;

import java.util.Arrays;

class BubbleSort{

    //Create a method with array input of data
    void bubbleSort(int array[]){
        int size = array.length;
        for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-1; j++)
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
    }
}
public class p075_BubbleSort {
    public static void main(String[] args) {
        int[] data = {-1,45,0,11,-9};
        BubbleSort bs=new BubbleSort();
        bs.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order");
        System.out.println(Arrays.toString(data));
    }
}

//Two times loop runs why ?
//Because first time we walk through the data second time we compare and sort
