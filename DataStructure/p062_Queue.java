package DataStructure;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class p062_Queue {
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        reverse(queue);
        System.out.println(queue);

        //System.out.println(queue);
        //System.out.println("Element at the front :"+queue.element());
        //System.out.println(queue.remove());
        //System.out.println(queue);
    }

}


/*
Queue
Printers
Operating Systems
Live Support Systems

Operations :
    Enqueue :   O(1)    --> To Add new element from rear
    Dequeue :   O(1)    --> To Remove element from front
    Peek    :   O(1)    --> Retrive last inserted element without removing it
    isEmpty :   O(1)    --> Checks if the strack have values
    isFull  :   O(1)

 */