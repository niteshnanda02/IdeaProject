package com.company.queueStack;
import java.util.*;
public class stackusingQueue {
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();

    /*The method pop which return the element poped out of the stack*/
    static int pop()
    {
        // Your code here
        if(q1.isEmpty())
            return -1;
        return q1.remove();
    }

    /* The method push to push element into the stack */
    static void push(int a)
    {
        // Your code here
        q2.add(a);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1=q2;
    }

    public static void main(String[] args) {
//        push(1);
//        push(2);
//        push(3);
//        System.out.println(pop());
//        System.out.println(pop());
//        System.out.println(pop());
//        System.out.println(pop());
        System.out.println("HELLO"+args[0]);
    }
}
