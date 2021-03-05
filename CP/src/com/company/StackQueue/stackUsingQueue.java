package com.company.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        stack(queue);
    }

    private static void stack(Queue<Integer> queue) {
        if(queue.isEmpty())
            return;
        int item=queue.poll();
        stack(queue);
        System.out.println(item);
    }
}
