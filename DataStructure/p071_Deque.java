package DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class p071_Deque {
    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();

        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);

        System.out.println("Deque "+numbers);
        System.out.println("First Element :"+numbers.peekFirst());
        System.out.println("Last Element :"+numbers.peekLast());
        System.out.println("Remove First Element "+numbers.pollFirst());
        System.out.println("Remove Last Element "+numbers.pollLast());
        System.out.println("Deque "+numbers);

    }
}
