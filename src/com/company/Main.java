package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        try {
            StackType methods = new StackType();
            Stack<Integer> stack = methods.createAndFillStack(10000);
            methods.reverseStack(stack);
            methods.stackIterator(stack);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Done");
        }
    }
}
