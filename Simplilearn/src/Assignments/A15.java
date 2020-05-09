package Assignments;

import java.util.*;
//Array List
public class A15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("--------1. List--------");
        list.add("Ravi");
        list.add("Bharath");
        list.add("Sarah");
        list.add("Naveen");
        list.add("Samar");

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<String> llist = new LinkedList<String>();
        System.out.println("--------2.LList--------");
        llist.add("Ravi");
        llist.add("Bharath");
        llist.add("Sarah");
        llist.add("Naveen");
        llist.add("Samar");
        Iterator itr1 = list.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("--------3.Vector--------");
        Vector<String> vector = new Vector<>();
        vector.add("vector 1 ");
        vector.add("vector 2 ");
        vector.add("vector 3 ");
        vector.add("vector 4 ");

        Iterator itr2 = vector.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("--------4.Stack--------");
        Stack<String> stack = new Stack<>();
        stack.push("Stack 1");
        stack.push("Stack 2");
        stack.push("Stack 3");
        stack.push("Stack 4");
        stack.push("Stack 5");

        Iterator itr3 = stack.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        System.out.println("--------3.Queue--------");
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Queue 1");
        pq.add("Queue 2");
        pq.add("Queue 3");
        pq.add("Queue 4");
        pq.add("Queue 5");

        //System.out.println(pq.element());
        //System.out.println(pq.peek());
        pq.remove();
        pq.remove();
        pq.poll();
        pq.poll();
        Iterator itr4 = pq.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }
        pq.remove();


    }
}
