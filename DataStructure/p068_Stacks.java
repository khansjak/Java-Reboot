package DataStructure;

public class p068_Stacks {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}


//Library Function Implementation