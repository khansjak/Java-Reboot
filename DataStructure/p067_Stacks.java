package DataStructure;

import java.util.Arrays;

//Build a Stack using Array
class MyStack {
    //Data Members
    private int arr[];
    private int top;
    private int capacity;

    //Constructor
    MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //Methods
    public void push(int x) {
        if (isFull()) {
            System.out.printf("Overflown\n Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack\n terminating \n");
            System.exit(1);
        }
        System.out.println("Popping one out");
        return arr[top--];
    }

    //Utility  : Check Size
    public int size() {
        return top + 1;
    }

    //Utility  : Check Empty Stack
    public Boolean isEmpty() {
        return top == -1;
    }

    //Utility  : Check Full Stack
    public Boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", top=" + top +
                ", capacity=" + capacity +
                '}';
    }
}

public class p067_Stacks {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        System.out.printf("Stack"+stack);
    }

}
