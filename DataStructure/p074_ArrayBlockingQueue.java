package DataStructure;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class p074_ArrayBlockingQueue {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> numbers  = new ArrayBlockingQueue(5);
        numbers.put(2);
        numbers.put(1);
        numbers.put(3);


        System.out.println("Blocking Queue :"+numbers);

        //Remove Element from Blocking queue
        System.out.println("Removed element :"+numbers.take());

    }
}
