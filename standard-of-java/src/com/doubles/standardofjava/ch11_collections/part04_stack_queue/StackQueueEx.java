package com.doubles.standardofjava.ch11_collections.part04_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new LinkedList();

        stack.push("0");
        stack.push("1");
        stack.push("2");
        stack.push("3");

        queue.add("0");
        queue.add("1");
        queue.add("2");
        queue.add("3");

        System.out.println("Stack");
        while (!stack.empty())
            System.out.println(stack.pop());

        System.out.println();

        System.out.println("Queue");
        while (!queue.isEmpty())
            System.out.println(queue.poll());
    }
}
