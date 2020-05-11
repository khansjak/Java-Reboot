package DataStructure;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class p069_Queue {
    public static void main(String[] args) {
        /*Creating queue using linked list */
        Queue<Integer> numbers = new LinkedList<>();

        //Offer elements to the queue
        numbers.offer(1);
        numbers.add(2);
        numbers.offer(3);
        System.out.println("Queue :"+numbers);

        //Access element of the queue
        int accessNumber = numbers.peek();
        System.out.println("Accessed Element "+accessNumber);

        //Remove an element
        int removedNumber = numbers.poll();
        System.out.println("Removed number "+removedNumber);
        System.out.println(numbers);

    }
}


