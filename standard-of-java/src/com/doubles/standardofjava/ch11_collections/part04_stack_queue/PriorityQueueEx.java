package com.doubles.standardofjava.ch11_collections.part04_stack_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue priorityQueue = new PriorityQueue();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(4);
        System.out.println(priorityQueue);

        Object obj = null;
        while ((obj = priorityQueue.poll()) != null)
            System.out.println(obj);
    }
}
