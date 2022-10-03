package datastructures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2); //.push to add an item to the stack
        stack.push(4);
        stack.push(6);
        System.out.println(stack.peek()); //looks at the top of stack, aka last item added
        System.out.println(stack.size()); //view the amount of items in the stack
        System.out.println(stack.pop()); //removes last item pushed from stack
        System.out.println(stack.size());
        System.out.println(stack.empty()); //gives you a boolean "Is the stack empty?"


    }
}
