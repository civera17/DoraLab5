package com.company;

import java.io.*;
import java.util.*;


class StackType {

    public Stack<Integer> createAndFillStack(int bound) {
        Stack<Integer> stack = new Stack<>();
        Random random = new Random();
            stack.push(random.nextInt(bound));
        return stack;
    }

    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    public void stackIterator(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Integer integer : stack) {
                System.out.println(integer);
            }
            System.out.println("\n");
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop :");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top : " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);
    }

    public Stack<Integer> reverseStack(Stack<Integer> stack) {
        System.out.println("\n Reversing number in stack");
        stackIterator(stack);
        int num = stack.peek();
        int reversed = 0;
        stack.clear();
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        stack.push(reversed);
        System.out.println("\n Done , number reversed");
        return stack;
    }
}
