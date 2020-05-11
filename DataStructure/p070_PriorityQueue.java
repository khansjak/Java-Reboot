package DataStructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class p070_PriorityQueue {

    public static void main(String[] args) {
        //Create queue using PriorityQueue class
        Queue numbers = new PriorityQueue();

        //Offer elements
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);

        System.out.println("Queue  :"+numbers);
        System.out.println("Access an element "+numbers.peek());
        System.out.printf("Remove an element "+numbers.remove());
        System.out.println("Queue  :"+numbers);

        Iterator itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Contains 2 ?:"+numbers.contains(2));
        System.out.println("Contains 7 ?:"+numbers.contains(7));
        System.out.println("Size of Queue :"+numbers.size());
        System.out.println("To Array "+numbers.toArray());

    }


}
