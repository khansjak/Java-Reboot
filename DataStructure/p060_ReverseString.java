package DataStructure;

//Reverse a string using stack

import java.util.Stack;

public class p060_ReverseString {
    public static void main(String[] args) {

        String str = "abcd";
        //String str = null;
        //Above statement will give null pointer exception which will reuire throw or try catch to handle it.


        StringReverser stringReverser = new StringReverser();
        String result = stringReverser.reverse(str);
        System.out.println("Reversed String :" + result);
    }
}

class StringReverser {
    public String reverse(String input) {
        if (input==null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
        String reversed = "";

      /*
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

       */

        for (char ch : input.toCharArray()
        )
            stack.push(ch);
        while (!stack.isEmpty())
            reversed += stack.pop();
        return reversed;

    }
}