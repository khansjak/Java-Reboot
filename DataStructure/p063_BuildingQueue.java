package DataStructure;

import java.util.Stack;


class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    //O(1)
    public void enqueue(int item) {
        stack1.push(item);
    }

    //O(n)
    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }


}

public class p063_BuildingQueue {
    public static void main(String[] args) {
        QueueWithTwoStacks qwts = new QueueWithTwoStacks();
        qwts.enqueue(10);
        qwts.enqueue(20);
        qwts.enqueue(30);

        var first = qwts.dequeue();
        System.out.println(first);
        int item = qwts.dequeue();
        System.out.println(item);
        System.out.println("Queue is Empty ? :" + qwts.isEmpty());

    }

}
