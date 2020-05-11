package DataStructure;

import java.util.ArrayDeque;

public class p073_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> heroes = new ArrayDeque<>();
        heroes.add("Captain America");
        heroes.add("Ant Man");
        heroes.add("Hawkeye");
        heroes.add("Black Widow");

        System.out.println("ArrayDeque "+heroes);

        for (String hero:heroes
             ) {
            System.out.println("Marvel Charcter :"+hero);
        }

        System.out.println("Peek "+heroes.peek());
        System.out.println("Peek First  "+heroes.peekFirst());
        System.out.println("Peek Last  "+heroes.peekLast());

        System.out.println("Remove "+heroes.remove());
        System.out.println("After remove () :"+heroes);

    }
}
