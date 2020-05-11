package DataStructure;

import java.util.Arrays;

class PriorityQueue {
    private int[] items = new int[5];
    private int count;


    public void add(int item) {
        for (int i = count - 1; i > 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
            items[i + 1] = item;
            count++;
        }
    }

    //Method : Remove
    public int remove(){
        if (count==0){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public boolean isEmpty(){
        return count==0;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }

}

public class p065_BuildingPriorityQ {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(1);
        queue.remove();
        queue.isEmpty();

        System.out.printf("Priority Queue :" + queue);
    }
}
