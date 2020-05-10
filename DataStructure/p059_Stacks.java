package DataStructure;

import java.util.Stack;

public class p059_Stacks {
    public static void main(String[] args) {
        //Stacks are generic types
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println("Stacks :"+stack);
        System.out.println("Peek ˜˜ast Inserted Element :"+stack.peek());
        System.out.println("Pop ~Remove last element :"+stack.pop());
        var top = stack.pop();
        System.out.println("New Top Value :"+top);

    }
}
