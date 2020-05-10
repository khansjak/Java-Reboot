package DataStructure;

import java.util.Arrays;

//Stack Class
class Stack {
    private int[] items = new int[5];
    private int count;

    //Methods : Push
    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();
        items[count++] = item;
    }

    //Method : Pop
    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    //Method : Peek
    public int peek() {
        if (count == 0)
            throw new IllegalStateException();
        return items[count - 1];

    }

    //method : isEmpty
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var contents = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(contents);
    }
}

public class p061_BuildingStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        //stack.pop();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println(stack);
        System.out.printf("Last Popped Element :" + stack.pop());
        System.out.println("Last Element :" + stack.peek());
        System.out.printf("Is Empty ? :" + stack.isEmpty());
    }
}
